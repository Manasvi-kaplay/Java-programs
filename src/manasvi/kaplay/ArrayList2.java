
package manasvi.kaplay;
import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
       ArrayList a1=new ArrayList<String>();
       System.out.println("Initial size of a1:"+a1.size());
       a1.add("B");
       a1.add("C");
       a1.add("D");
       a1.add(0,"A");
       System.out.println(a1);
       System.out.println("Size of a1:"+a1.size());
       for(Object s:a1){
           System.out.println(s);
       }
       a1.remove("A");
       a1.remove(0);
       System.out.println("Final size of a1:"+a1.size());
       for(Object s2:a1){
           System.out.println(s2);
       }
    }
    
}
