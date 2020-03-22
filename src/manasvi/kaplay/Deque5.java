
package manasvi.kaplay;
import java.util.*;
public class Deque5 {
    public static void main(String[] args) 
        throws IllegalStateException 
    { 
  
        // create object of Deque 
        Deque<Integer> DQ 
            = new LinkedList<Integer>(); 
  
        if (DQ.offerLast(1)) 
            System.out.println("The Deque is not full and 1 is inserted"); 
        else
            System.out.println("The Deque is full"); 
  
        if (DQ.offerLast(2)) 
            System.out.println("The Deque is not full and 2 is inserted"); 
        else
            System.out.println("The Deque is full"); 
        System.out.println("Deque: " + DQ);
    }
}
