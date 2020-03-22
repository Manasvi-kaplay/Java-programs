
package manasvi.kaplay;

import java.util.*;
enum Color2 
{ 
    RED, GREEN, BLUE; 
} 
public class Enum56 {
    public static void main(String args[]){
    Color2 arr[] = Color2.values(); 
  
        // enum with loop 
        for (Color2 col : arr) 
        { 
            // Calling ordinal() to find index 
            // of color. 
            System.out.println(col + " at index "
                             + col.ordinal()); 
        } 
  
        // Using valueOf(). Returns an object of 
        // Color with given constant. 
        // Uncommenting second line causes exception 
        // IllegalArgumentException 
        System.out.println(Color2.valueOf("RED")); 
        // System.out.println(Color.valueOf("WHITE")); 
}
}