
package manasvi.kaplay;

import java.util.*;
class DemoClass<T> {
   //T stands for "Type"
   private T t;
 
   public void set(T t) { this.t = t; }
    
   public T get() { return t; }
}
public class Generics41 {
    public static void main(String args[]){
        DemoClass<String> instance = new DemoClass<String>();
instance.set("lokesh");   //Correct usage
instance.set("18989"); 
System.out.println(instance.get());
    }
}
