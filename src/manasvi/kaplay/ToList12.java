
package manasvi.kaplay;
import java.util.*;
public class ToList12 {
    public static void main(String args[]){
        String s[]={"C","A","B","D"};
        System.out.println("String array:  ");
        for(String str:s){
             System.out.print("  "+str);
        }
       ArrayList a1=new ArrayList<String>();
       for(String str2:s){
           a1.add(str2);
       }
       System.out.println("ArrayList a1:  "+a1);
       ArrayList a2=new ArrayList<String>();
      Collections.addAll(a2, s);
      System.out.println("ArrayList a2:  "+a2);
    }
}
