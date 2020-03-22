
package manasvi.kaplay;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
       ArrayList a1=new ArrayList<String>();
       System.out.println("Initial size of a1:"+a1.size());
       a1.add("B");
       a1.add("C");
       a1.add("D");
       a1.add(0,"A");
       System.out.println("Final size of a1:"+a1.size());
       System.out.println(a1);
       Iterator itr=a1.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
    
}
