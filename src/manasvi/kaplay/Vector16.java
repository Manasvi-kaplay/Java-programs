
package manasvi.kaplay;
import java.util.*;
public class Vector16 {
    public static void main(String args[]){
        Vector v = new Vector(); 
  
        // ensuring capacity 
        v.ensureCapacity(25); 
  v.add(1); 
        v.add(2); 
        v.add("good"); 
        v.add("morning"); 
        v.add(4); 
        // get the element at index of Geeks 
        System.out.println("index of Geeks is: " + v.indexOf("good")); 
        // cheking capacity 
        System.out.println("Minimum capacity: " + v.capacity()); 
    }
}
