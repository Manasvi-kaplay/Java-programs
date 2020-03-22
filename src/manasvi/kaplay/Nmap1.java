
package manasvi.kaplay;
import java.util.*;
public class Nmap1 {
    public static void main(String[] args) 
    { 
        NavigableMap<String, Integer> nm = 
                          new TreeMap<String, Integer>(); 
        nm.put("C", 888); 
        nm.put("Y", 999);
        System.out.printf("Descending Set  : %s%n", 
                                nm.descendingKeySet()); 
        System.out.printf("Floor Entry  : %s%n", 
                                nm.floorEntry("L")); 
        System.out.printf("First Entry  : %s%n",nm.firstEntry());

        System.out.printf("Original Map : %s%n", nm); 
        System.out.printf("Reverse Map : %s%n", 
                                 nm.descendingMap());
    }
}
