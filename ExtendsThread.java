/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subadrun
 */
public class ExtendsThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread is running...");
    }
    
    public static void main(String args[]) {
        ExtendsThread t1 = new ExtendsThread();
        t1.start();
    }
}
