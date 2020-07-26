/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subadrun
 */
public class ImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread is running with implements runnable  ...");
    }
    
    public static void main(String args[]) {
        ImplementsRunnable m1 = new ImplementsRunnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
