
package manasvi.kaplay;

import java.util.*;
class Employee{
    int eid;
    String ename;
    Employee(int eid,String ename){
        this.eid=eid;
        this.ename=ename;
    }
}
public class LinkedList7 {
    public static void main(String args[]){
        LinkedList l1=new LinkedList<Employee>();
        Employee e1=new Employee(1,"aman");
        Employee e2=new Employee(2,"anju");
        l1.add(e1);
        l1.add(e2);
        Iterator itr=l1.iterator();
        while(itr.hasNext()){
            Employee e=(Employee) itr.next();
            System.out.println("Employee id: "+e.eid+" Employee name: "+e.ename);
        }
    }
}
