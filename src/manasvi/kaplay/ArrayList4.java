package manasvi.kaplay;
import java.util.*;
public class ArrayList4 {
    public static void main(String args[]){
        ArrayList a1=new ArrayList<String>();
        //String array[];
       a1.add("B");
       a1.add("C");
       a1.add("D");
       a1.add(0,"A");
       //System.out.println("Final size of a1:"+a1.size());
       System.out.println(a1);
       Object array[]=a1.toArray();
       System.out.println("Arraylist after converting to array: "+array);
       for(Object obj:array){
           System.out.println(obj);
       }
    }
}
