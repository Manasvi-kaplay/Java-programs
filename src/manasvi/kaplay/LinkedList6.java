package manasvi.kaplay;
import java.util.*;
public class LinkedList6 {
    public static void main(String args[]){
         String colors[]={"blue","red","orange","black"};
         String colors2[]={"golden","green","pink"};
         List<String> list1=new LinkedList<String>();
         List<String> list2=new LinkedList<String>();
         for(String s:colors){
             list1.add(s);
         }
         for(String s2:colors2){
             list2.add(s2);
         }
         System.out.println("colors:"+list1);
         System.out.println("Reverse list list1:");
          ListIterator<String> litr=list1.listIterator(list1.size()-1);
          while(litr.hasPrevious()){
              //System.out.print("Hey");
              Object element=litr.previous();
              System.out.print(" "+element);
          }
          while(litr.hasNext()){
              String c=litr.next();
              litr.set(c.toUpperCase());
          }
          System.out.println("colors..........."+list1);
          System.out.println("colors2:"+list2);
         
    }
}
