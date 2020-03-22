
package manasvi.kaplay;

import java.util.*;
public class Deque2 {
    public static void main(String[] args) 
    { 
        Deque<String> deque = new LinkedList<String>(); 
  
        // We can add elements to the queue in various ways 
        deque.add("Element 1 (Tail)"); // add to tail 
        deque.addFirst("Element 2 (Head)"); 
        System.out.println(deque + "\n"); 
        Iterator reverse = deque.descendingIterator(); 
        System.out.println("Reverse Iterator"); 
        while (reverse.hasNext()) 
            System.out.println("\t" + reverse.next()); 
  
        // Peek returns the head, without deleting 
        // it from the deque 
        System.out.println("Peek " + deque.peek()); 
        System.out.println("After peek: " + deque); 
    }
}
