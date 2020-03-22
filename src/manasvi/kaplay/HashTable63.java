
package manasvi.kaplay;
import java.util.*;
public class HashTable63 {
    public static void main(String[] arg) 
    { 
        // creating a hash table 
        Hashtable<Integer, String> h =  
            new Hashtable<Integer, String>(); 
  
        h.put(3, "Good"); 
        h.put(2, "mrng"); 
        //h.put(1, "isBest"); 
  
        // create enumeration 
        Enumeration e = h.elements(); 
  
        System.out.println("display values:"); 
  
        while (e.hasMoreElements()) { 
            System.out.println(e.nextElement()); 
        } 
    } 
}
