package manasvi.kaplay;
import java.util.*;
public class Vector17 {
    public static void main(String args[]){
        Vector v=new Vector();
        v.add(1); 
        v.add(2); 
        v.add("hello"); 
        v.add("world"); 
        v.add(4); 
         System.out.println("Initial capacity: " + v.capacity()); 
        // trim capacity to size 
        v.trimToSize(); 
        // checking capacity after triming 
        System.out.println("capacity after triming: " + v.capacity()); 
        System.out.println(" String equivalent of vector: " + v.toString()); 
    } 
}
