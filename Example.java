/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subadrun
 */
public class Example {
    public static void main(String args[]) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread is running ...");
            }
        });
        
        t.start();
    }
}
