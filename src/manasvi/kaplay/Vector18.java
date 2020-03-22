
package manasvi.kaplay;
import java.util.*;
public class Vector18 {
    public static void main(String args[]){
        String elements[] = { "M", "N", "O", "P", "Q" }; 
        Set set = new HashSet(Arrays.asList(elements)); 
        String[] strObj = new String[set.size()]; 
        strObj = (String[])set.toArray(strObj); 
        for (int i = 0; i < strObj.length; i++) { 
            System.out.println(strObj[i]); 
        } 
        System.out.println(set);
    }
}
