
package manasvi.kaplay;

import java.util.*;
        enum Color3 
{ 
    RED, GREEN, BLUE; 
  
    // enum constructor called separately for each 
    // constant 
    private Color3() 
    { 
        System.out.println("Constructor called for : " + 
        this.toString()); 
    } 
  
    public void colorInfo() 
    { 
        System.out.println("Universal Color"); 
    } 
} 
public class Enum57 {
    public static void main(String args[]){
    Color3 c1 = Color3.RED; 
        System.out.println(c1); 
        c1.colorInfo();
    }
}
