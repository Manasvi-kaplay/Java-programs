
package manasvi.kaplay;

import java.util.*;

public class PrgmHashMap10 {
    public static void main(String args[]){
    HashMap hm=new HashMap<Integer,String>();
    hm.put(1,"abhay");
    hm.put(2,"akshay");
    System.out.print(hm);
    Set< Map.Entry< Integer,String> > st = hm.entrySet();    
  
       for (Map.Entry< Integer,String> me:st) 
       { 
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
       } 
    
    }
}
