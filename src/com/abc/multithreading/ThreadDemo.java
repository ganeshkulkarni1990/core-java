package com.abc.multithreading;

class MyThread extends Thread {
    int c = 0;

    private static int shareMemory = 0;
    public MyThread(int i){
        this.c = i;
    }
    
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        long ans = 0;
        //actual code which you want to execute in thread
        for (int i = 1; i <=10; i++) {
           System.out.println(Thread.currentThread().getName() + " " + (i*c));
        }
        //System.out.println(ans);
    }
}

public class ThreadDemo {

    public static void main(String... args) throws InterruptedException {
        System.out.println(Thread.currentThread());
        Thread t[] = new Thread[5];
        for(int i=0;i<2;i++){
            t[i]  = new MyThread(i+1);
            t[i].start();
        }

        for(int i=0;i<2;i++){
            t[i].join();
        }
        //main thread and thread-0 runs in parallel on different system thread
        //suppose you want to start something after only thread returns
        //we start simaltaneous multiple threads and wait for all to finish
        //wait till t completes
        for (int i = 100; i <= 110; i++) {
            System.out.println("    " + i);
        }
    }
}
