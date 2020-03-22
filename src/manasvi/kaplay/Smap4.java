
package manasvi.kaplay;
import java.util.*;
public class Smap4 {
    public static void main(String[] args) 
    { 
  
        // Creating an empty TreeMap 
        SortedMap<Integer, String> 
            sotree_map = new TreeMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        sotree_map.put(10, "A"); 
        sotree_map.put(15, "B"); 
        //sotree_map.put(20, "Geeks"); 
        //sotree_map.put(25, "Welcomes"); 
        //sotree_map.put(30, "You"); 
  
        // Displaying the TreeMap 
        System.out.println("Initial Mappings are: "
                           + sotree_map); 
  
        // Using values() to get the set view of values 
        System.out.println("The collection is: "
                           + sotree_map.values()); 
    } 
}
