
package manasvi.kaplay;
import java.util.*;
public class Deque4 {
    public static void main(String[] args) 
        throws IllegalStateException 
    { 
  
        // create object of Deque 
        Deque<Integer> DQ 
            = new LinkedList<Integer>(); 
  
        // Add numbers to end of Deque 
        DQ.add(7855642); 
        DQ.add(35658786); 
        DQ.add(5278367); 
        DQ.add(74381793); 
  
        // print Deque 
        System.out.println("Deque: " + DQ); 
  
        // print head 
        System.out.println("Deque's head: " + DQ.element()); 
    } 
}
