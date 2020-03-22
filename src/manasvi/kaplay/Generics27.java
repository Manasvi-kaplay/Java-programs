
package manasvi.kaplay;
import java.util.*;
public class Generics27 {
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + 
                           " = " + element); 
    } 
   
    // Driver method 
    public static void main(String[] args) 
    { 
         // Calling generic method with Integer argument 
        genericDisplay(11); 
   
        // Calling generic method with String argument 
        genericDisplay("Good mrng"); 
   
        // Calling generic method with double argument 
        genericDisplay(1.0); 
    } 
}
