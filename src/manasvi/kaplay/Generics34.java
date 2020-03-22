
package manasvi.kaplay;
import java.util.*;
public class Generics34<T> {
    private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      Generics34<Integer> integerBox = new Generics34<Integer>();
      Generics34<String> stringBox = new Generics34<String>();
    
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));

      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
   }
}
