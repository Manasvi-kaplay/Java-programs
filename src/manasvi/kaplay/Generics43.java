
package manasvi.kaplay;
import java.util.*;
//import static javafx.scene.input.KeyCode.T;
class Dimension<T>
{
    T length;
    T width;
   T height;
   //Generic constructor
   public Dimension(T length, T width, T height)
   {
      super();
      this.length = length;
      this.width = width;
      this.height = height;
   }
}
public class Generics43 {
    public static void main(String args[]){
        Dimension d=new Dimension(89,78,67);
        System.out.println("Length: "+d.length+" Width: "+d.width+" Height: "+d.height);
    }
}
