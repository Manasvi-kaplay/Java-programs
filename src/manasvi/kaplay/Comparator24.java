
package manasvi.kaplay;
import java.util.*;
//import manasvi.kaplay.Student4.CustomerSortingComparator;
class Student4{  
int rollno;  
String name;  
int age;  
Student4(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}  
class AgeComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Student4 s1=(Student4)o1;  
Student4 s2=(Student4)o2;  
  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  

class NameComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Student4 s1=(Student4)o1;  
Student4 s2=(Student4)o2;  
  
return s1.name.compareTo(s2.name);  
}  
}  
public class Comparator24 {
    public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(new Student4(101,"Vijay",23));  
al.add(new Student4(106,"Ajay",27));  
al.add(new Student4(105,"Jai",21));  
  
System.out.println("Sorting by Name");  
  
Collections.sort(al,new NameComparator());  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
Student4 st=(Student4)itr.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("Sorting by age");  
  
Collections.sort(al,new AgeComparator());  
Iterator itr2=al.iterator();  
while(itr2.hasNext()){  
Student4 st=(Student4)itr2.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
  
}  
}
