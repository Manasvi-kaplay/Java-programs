
package manasvi.kaplay;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;


public class Properties52 {
    public static void main(String arg[]) throws IOException 
    { 
        Properties gfg = new Properties(); 
        StringWriter writer = new StringWriter(); 
        gfg.put("ide", "hello"); 
        gfg.put("contribute", "hi"); 
        gfg.put("quiz", "quiz"); 
          
        gfg.store(writer, "Demo of Properties class"); 
          
        System.out.print(writer.toString()); 
    } 
}
