package manasvi.kaplay;
import java.util.*;
public class Vector15 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        System.out.println("How many elements you want to enter?");
        int num=sc.nextInt();
        //System.out.println();
        int i=1;
        String s;
        while(i<=num){
            //System.out.println("Element "+i+":");
             s=sc.nextLine();
            v.add(s);
            i+=1;
        }
        System.out.println("Vector:"+v);
        System.out.println("Vector capacity: "+v.capacity());
        String srch;
        System.out.println("Enter element to be searched ");
        srch=sc.nextLine();
        if(v.contains(srch)){
            System.out.println(srch+" is present");
        }else{
            System.out.println(srch+" is not present");
        }
    }
}
