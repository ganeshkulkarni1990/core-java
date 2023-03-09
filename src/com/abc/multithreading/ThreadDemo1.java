package com.abc.multithreading;

class MyThread1 extends Thread {
    DataStructure dataStructure = null;

    public MyThread1(DataStructure dataStructure) {
        this.dataStructure = dataStructure;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        //access shared memory
        try {
            Thread.sleep(10);
            //critical section is section which requires synchronisation
//            synchronized (lock) { //acquire lock at a time one thread can enter
//                shareMemory++;
//            } //release
            dataStructure.incrementCounter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class DataStructure {
    public int shareMemory = 0;
    public synchronized void incrementCounter() {
        System.out.println(Thread.currentThread().getName() + " before:" +shareMemory);
        shareMemory++;
        System.out.println(Thread.currentThread().getName() + " after:" +shareMemory);
    }
}

public class ThreadDemo1 {

    public static void main(String... args) throws InterruptedException {
        System.out.println(Thread.currentThread());
        DataStructure dataStructure = new DataStructure();
        Thread t[] = new Thread[5];
        for (int i = 0; i < 5; i++) {
            t[i] = new MyThread1(dataStructure);
            t[i].start();
        }//2 thread using 1 lock

//        for(int i=0;i<2;i++){
//            t[i].join();
//        }
        //main thread and thread-0 runs in parallel on different system thread
        //suppose you want to start something after only thread returns
        //we start simaltaneous multiple threads and wait for all to finish
        //wait till t completes
//        for (int i = 100; i <= 110; i++) {
//            System.out.println("    " + i);
//        }
    }
}
