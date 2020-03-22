package manasvi.kaplay;
import java.util.*;
public class PrgmHashMap11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Map hm=new HashMap<Integer,String>();
        hm.put(1,"abhay");
    hm.put(2,"akshay");
    //System.out.print(hm);
    Set<Map.Entry<Integer,String>> s=hm.entrySet();
    Iterator itr=s.iterator();
    while(itr.hasNext()){
        Map.Entry me=(Map.Entry) itr.next();
        System.out.println("Key: "+me.getKey()+" Value: "+me.getValue());
    }
    System.out.println("Enter the key to be searched");
    int k=sc.nextInt();
    if(hm.containsKey(k)){
        System.out.println("Value corresponding to: "+k+" is "+hm.get(k));
    }
    else{
        System.out.println("Key "+k+" not found ");
    }
    hm.putIfAbsent(3,"anika");
    System.out.print(hm);
    }
}
