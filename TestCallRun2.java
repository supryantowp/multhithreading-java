/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subadrun
 */
public class TestCallRun2 extends Thread {
     public void run() {
         for (int i = 1; i < 5; i++) {
             System.out.println(i);
             try{
                 Thread.sleep(500);
             } catch(InterruptedException e) {
                 System.out.println(e);
             }
         }
     }
     
     public static void main (String args[]) {
         TestCallRun2 t1 = new TestCallRun2();
         TestCallRun2 t2 = new TestCallRun2();
         
         t1.run();
         t2.run();
         
         t1.start();
         t2.start();
     }
}


