
package manasvi.kaplay;
import java.io.PrintWriter;
import java.util.*;
public class Properties46 {
    public static void main(String arg[]) 
    { 
        Properties gfg = new Properties(); 
          
        PrintWriter writer = new PrintWriter(System.out); 
          
        gfg.put("ide", "ide.geeksforgeeks.org"); 
        //gfg.put("contribute", "contribute.geeksforgeeks.org"); 
        //gfg.put("quiz", "quiz.geeksforgeeks.org"); 
          
        // printing list using PrintWriter object 
        gfg.list(writer); 
          
        // flushing the stream 
        writer.flush(); 
    } 
}
