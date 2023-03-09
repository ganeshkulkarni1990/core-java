package com.abc.multithreading;

public class MultiThreadingBasic implements Runnable {
    @Override
    public void run() {
        try {
            //this code will run parellel to main method
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(100);
            }

            //real time task which you want to execute in parallel or execute on another thread
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
