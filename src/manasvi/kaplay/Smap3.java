
package manasvi.kaplay;
import java.util.*;
public class Smap3 {
    public static void main(String[] argv) 
    { 
        try { 
            // Creating object of TreeMap 
            SortedMap<Integer, String> 
                sotreemap = new TreeMap<Integer, String>( 
                    Collections.reverseOrder()); 
  
            // Populating tree map 
            sotreemap.put(1, "one"); 
            sotreemap.put(2, "two"); 
            System.out.println("SortedTreeMap: " + sotreemap); 
            // Getting used Comparator in the map 
            // using comparator() method 
            Comparator comp = sotreemap.comparator(); 
            // Pritnig the comparator value 
            System.out.println("Comparator value: " + comp); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
}
