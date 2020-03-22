
package manasvi.kaplay;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties54 {
    public static void main(String arg[]) throws IOException 
    { 
        Properties gfg = new Properties(); 
         
        gfg.put("ide", "ide.geeksforgeeks.org"); 
        gfg.put("contribute", "contribute.geeksforgeeks.org"); 
        gfg.put("quiz", "quiz.geeksforgeeks.org"); 
          
        FileOutputStream out = new FileOutputStream("properties.xml"); 
        FileInputStream in = new FileInputStream("properties.xml"); 
          
        // store the properties into specified xml 
        gfg.storeToXML(out, null); 
          
        // load the properties from specified xml 
        gfg.loadFromXML(in); 
          
        gfg.list(System.out); 
    } 
}
