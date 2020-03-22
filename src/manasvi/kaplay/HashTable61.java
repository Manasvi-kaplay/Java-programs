
package manasvi.kaplay;
import java.util.*;
public class HashTable61 {
    public static void main(String args[]){
    Hashtable<Integer, String> h = 
                      new Hashtable<Integer, String>(); 
  
        Hashtable<Integer, String> h1 = 
                      new Hashtable<Integer, String>(); 
  
        h.put(3, "Hello"); 
        h.put(2, "world"); 
        h.put(1, "hi"); 
  
        // create a clone or shallow copy of hash table h 
        h1 = (Hashtable<Integer, String>)h.clone(); 
  
        // checking clone h1 
        System.out.println("values in clone: " + h1); 
  
        // clear hash table h 
        h.clear(); 
  
        // checking hash table h 
        System.out.println("after clearing: " + h); 
    } 
}
