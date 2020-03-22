
package manasvi.kaplay;
import java.util.*;
public class PrgHashSet9 {
    public static void main(String args[]){
        HashSet s=new HashSet<String>();
        Scanner sc=new Scanner(System.in);
        s.add("B");
        s.add("A");
        s.add("C");
        System.out.println("Enter element to be searched");
        String srch=sc.nextLine();
        if(s.contains(srch)){
        System.out.println("Hash set s contains "+srch);
    }
        else{
            System.out.println("Hash set s does not contain "+srch);
        }
    }
}
