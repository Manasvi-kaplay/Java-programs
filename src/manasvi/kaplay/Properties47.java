
package manasvi.kaplay;
import java.util.*;
public class Properties47 {
    public static void main(String arg[]) 
    { 
        Properties gfg = new Properties(); 
        Set str; 
        String s; 
        gfg.put("ide", "ide.geeksforgeeks.org"); 
        gfg.put("contribute", "contribute.geeksforgeeks.org"); 
        gfg.put("quiz", "quiz.geeksforgeeks.org"); 
          
        Enumeration name = gfg.propertyNames(); 
          
        // print the enumaration elements 
        System.out.println(name.nextElement()); 
        System.out.println(name.nextElement()); 
        System.out.println(name.nextElement()); 
          
    } 
}
