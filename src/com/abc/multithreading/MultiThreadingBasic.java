package com.abc.multithreading;

public class MultiThreadingBasic {
    public static void main(String ...args){
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(i);
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}

//class Test implements Runnable {
//    @Override
//    public void run() {
//        try {
//            //this code will run parellel to main method
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//                Thread.sleep(100);
//            }
//
//            //real time task which you want to execute in parallel or execute on another thread
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}