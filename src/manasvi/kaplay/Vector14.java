package manasvi.kaplay;
import java.util.*;
public class Vector14 {
    public static void main(String args[]){
    ArrayList arr = new ArrayList(); 
        arr.add(3); 
        arr.add("hi"); 
        arr.add("hello"); 
        arr.add(4); 
        Vector v = new Vector(); 
        Vector v_clone = new Vector(); 
        v.addAll(arr); 
        System.out.println("vector v:" + v); 
        v.clear(); 
        // checking vector 
        System.out.println("after clearing: " + v);
        v_clone = (Vector) v.clone(); 
        // checking vector 
        System.out.println("Clone of v: " + v_clone); 
    }
}
