
package manasvi.kaplay;
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.util.*;
//import java.util.*;
public class Properties49 {
    public static void main(String arg[]) throws IOException 
    { 
        Properties gfg = new Properties(); 
        String s = "ide = ide.geeksforgeeks.org"; 
          
        FileOutputStream out = new FileOutputStream("properties.txt"); 
        FileInputStream in = new FileInputStream("properties.txt");   
          
        // write the property in the output stream file 
        out.write(s.getBytes()); 
          
        // load from input stream 
        gfg.load(in); 
          
        gfg.list(System.out); 
    } 
}
