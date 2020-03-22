
package manasvi.kaplay;

import java.io.IOException;
import java.util.Properties;


public class Properties51 {
    public static void main(String arg[]) throws IOException 
    { 
        Properties gfg = new Properties(); 
        gfg.put("ide", "ide.geeksforgeeks.org"); 
        gfg.put("contribute", "contribute.geeksforgeeks.org"); 
        gfg.put("quiz", "quiz.geeksforgeeks.org"); 
          
        // store the properties in output stream 
        gfg.store(System.out, "Demo of Properties class");    
    } 
}
