
package manasvi.kaplay;

import java.util.*;
public class HashTable62 {
    public static void main(String[] args) 
    { 
  
        // create a table and add some values 
        Map<String, Integer> table = new Hashtable<>(); 
        table.put("Pen", 10); 
        
        // print map details 
        System.out.println("hashTable: "
                           + table.toString()); 
  
        // provide value for new key which is absent 
        // using computeIfAbsent method 
        table.computeIfAbsent("newPen", k -> 600); 
        table.computeIfAbsent("newBook", k -> 800); 
  
        // print new mapping 
        System.out.println("new hashTable: "
                           + table); 
    } 
}
