
package manasvi.kaplay;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Properties53 {
    public static void main(String arg[]) throws IOException 
    { 
        Properties gfg = new Properties(); 
         
        gfg.put("ide", "ide.geeksforgeeks.org"); 
        //gfg.put("contribute", "contribute.geeksforgeeks.org"); 
        //gfg.put("quiz", "quiz.geeksforgeeks.org"); 
          
        // property name in the set 
        Set set = gfg.stringPropertyNames(); 
          
        System.out.print(set); 
    } 
}
