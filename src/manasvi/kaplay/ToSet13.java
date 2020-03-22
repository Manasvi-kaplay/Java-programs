
package manasvi.kaplay;
import java.util.*;
public class ToSet13 {
    public static void main(String args[]){
        String s[]={"D","A","B","C"};
        System.out.println("String array:  "+s);
        for(String str:s){
             System.out.print("  "+str);
        }
        HashSet hs=new HashSet<String>();
        for(String str2:s){
            hs.add(str2);
        }
        System.out.println("Hash set:  "+hs);
        HashSet hs2=new HashSet<String>();
        hs2.add("P");
        hs2.add("E");
        hs2.add("F");
        hs2.add("Z");
        hs2.add("K");
         System.out.println(hs2);
         TreeSet ts=new TreeSet<String>();
        ts.add("P");
        ts.add("E");
        ts.add("F");
        ts.add("Z");
        ts.add("K");
         System.out.println("Tree set...."+ts);
    }
}
