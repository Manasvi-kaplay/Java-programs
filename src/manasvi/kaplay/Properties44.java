
package manasvi.kaplay;

import java.util.*;
public class Properties44 {
    public static void main(String arg[]) 
    { 
        Properties gfg = new Properties(); 
        Set URL; 
        String str; 
          
        gfg.put("ide", "ide.geeksforgeeks.org"); 
         
          
        // checking what's in table 
        URL = gfg.keySet(); 
        Iterator itr = URL.iterator(); 
          
        while(itr.hasNext()) 
        { 
            str = (String)itr.next(); 
            System.out.println("The URL for " + str +  
                    " is " + gfg.getProperty(str)); 
        } 
          
        System.out.println(); 
          
        // looking for URL that not in list 
        str = gfg.getProperty("articl", "not found"); 
        System.out.println("The URL for article is " + str); 
          
    } 
}
