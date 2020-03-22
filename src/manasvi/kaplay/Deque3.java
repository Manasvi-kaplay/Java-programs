
package manasvi.kaplay;
import java.util.*;
public class Deque3 {
    public static void main(String[] args) 
    { 
        Deque<String> deque = new LinkedList<String>(); 
  
        // We can add elements to the queue in various ways 
        deque.add("one"); // add to tail 
        deque.addFirst("two"); 
        deque.addLast("three");
        System.out.println(deque + "\n");
        System.out.println("Pop " + deque.pop()); 
        System.out.println("After pop: " + deque); 
  
        // We can check if a specific element exists 
        // in the deque 
        System.out.println("Contains element 3: " + 
                        deque.contains("three")); 
  
        // We can remove the first / last element. 
        deque.removeFirst(); 
        deque.removeLast(); 
        System.out.println("Deque after removing " + 
                            "first and last: " + deque); 
  
    }
}
