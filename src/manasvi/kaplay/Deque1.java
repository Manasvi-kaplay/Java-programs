
package manasvi.kaplay;

import java.util.*;
public class Deque1 {
    public static void main(String[] args) 
    { 
        Deque<String> deque = new LinkedList<String>(); 
  
        // We can add elements to the queue in various ways 
        deque.add("Element 1 (Tail)"); // add to tail 
        deque.addFirst("Element 2 (Head)"); 
        deque.addLast("Element 3 (Tail)"); 
        deque.push("Element 4 (Head)"); //add to head 
        deque.offer("Element 5 (Tail)"); 
        deque.offerFirst("Element 6 (Head)"); 
        deque.offerLast("Element 7 (Tail)"); 
  
        System.out.println(deque + "\n"); 
  
        // Iterate through the queue elements. 
        System.out.println("Standard Iterator"); 
        Iterator iterator = deque.iterator(); 
        while (iterator.hasNext()) 
            System.out.println("\t" + iterator.next());
    }
}