package manasvi.kaplay;
import java.util.*;
public class LinkedList5 {
    public static void main(String args[]){
        LinkedList l1=new LinkedList<String>();
        l1.add("A2");
        l1.add("B1");
        System.out.println(l1);
        l1.addFirst("A1");
        l1.addLast("B2");
        System.out.println("l1 after using addFirst() and addLast() methods:  "+l1);
        l1.removeLast();
        System.out.println("l1 after using removeLast() methods:  "+l1);
        Object val=l1.get(0);
        l1.set(0, val+"Changed");
        System.out.println("l1 after change:  "+l1);
        System.out.println("l1 first element:  "+l1.getFirst()+"  l1 last element: "+l1.getLast());
    }
}
