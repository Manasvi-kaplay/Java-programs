/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manasvi.kaplay;

public class Multi78 extends Thread{  
 public void run(){  
  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
   System.out.println("daemon thread work");  
  }  
  else{  
  System.out.println("user thread work");  
 }  
 }  
 public static void main(String[] args){  
  Multi78 t1=new Multi78();//creating thread  
  Multi78 t2=new Multi78();  
  Multi78 t3=new Multi78();  
  
  t1.setDaemon(true);//now t1 is daemon thread  
    
  t1.start();//starting threads  
  t2.start();  
  t3.start();  
 }  
}  