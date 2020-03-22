
package manasvi.kaplay;
import java.util.*;
public class Multi71 extends Thread{  
 public void run(){  
   System.out.println("running thread name is:"+Thread.currentThread().getName());  
   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
  
  }  
 public static void main(String args[]){  
  Multi71 m1=new Multi71();  
  Multi71 m2=new Multi71();  
  m1.setPriority(Thread.MIN_PRIORITY);  
  m2.setPriority(Thread.MAX_PRIORITY);  
  m1.start();  
  m2.start();  
   
 }  }
