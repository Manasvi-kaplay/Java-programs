
package manasvi.kaplay;

import java.util.*;
interface DemoInterface<T1, T2> 
{
   T2 doSomeOperation(T1 t);
   T1 doReverseOperation(T2 t);
}
//A class implementing generic interface
class Demo implements DemoInterface<String, Integer>
{
   public Integer doSomeOperation(String t)
   {
       return 1+2;
      //some code
   }
   public String doReverseOperation(Integer t)
   {
       return "Hello world";
      //some code
   }
}
public class Generics42 {
    public static void main(String args[]){
        Demo d1=new Demo();
        int a=d1.doSomeOperation("hey");
        System.out.println("...."+a);
        String s=d1.doReverseOperation(2);
        System.out.println("...."+s);
    }
}
