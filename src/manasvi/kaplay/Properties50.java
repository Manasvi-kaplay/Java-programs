
package manasvi.kaplay;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;


public class Properties50 {
    public static void main(String arg[]) throws IOException 
    { 
        Properties gfg = new Properties(); 
        String s = "ide = ide"; 
          
        // creating a new reader 
        StringReader reader = new StringReader(s); 
          
        // loading from input stream 
        gfg.load(reader); 
          
        gfg.list(System.out); 
    } 
}
