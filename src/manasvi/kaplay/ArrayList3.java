package manasvi.kaplay;
import java.util.*;
class Student{
    String name;
    int rno;
    Student(String name,int rno){
        this.name=name;
        this.rno=rno;
    }
}
public class ArrayList3 {
    public static void main(String[] args) {
       Student s1=new Student("monica",20);
       Student s2=new Student("mona",21);
       ArrayList a1=new ArrayList<Student>();
       a1.add(s1);
       a1.add(s2);
       Iterator itr=a1.iterator();
       while(itr.hasNext()){
           Student st=(Student) itr.next();
           System.out.println("Name: "+st.name+"  Roll no.: "+st.rno);
       }
    }
}
