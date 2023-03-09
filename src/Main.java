import com.abc.multithreading.MultiThreadingBasic;

class TestThread extends Thread {
    public static int shareMemory = 0;

    //in synchronized method only one thread can enter at a time
    synchronized void incrementCount() {
        System.out.println(Thread.currentThread() + "before shareMemory:" + shareMemory);
//        try {
//            Thread.sleep(10);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        shareMemory++;
        System.out.println(Thread.currentThread() + "after shareMemory:" + shareMemory);
    }

    public void run() {
        System.out.println(Thread.currentThread() + "Thread Started");
        long ans = 0;
        try {
            //critical section that should be executed in synchronization
            incrementCount();
            for (int i = 0; i < 100000; i++) {
                for (int j = 0; j < i; j++) {
                    ans += (i * j);
                }
            }
        } catch (Exception e) {

        }
        System.out.println(ans);

        //call third party service for say maximum one of 2 sec
        //if we don't any response in 2 sec we declare thirdparty service dead/unreachable
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        //MultiThreadingBasic basic = new MultiThreadingBasic(); //this is task which we want to run parallely
        //TestThread t1 = new TestThread(); //you can runnable in thread or you can write in thread itself
        //t1.start(); ///pushed to queue //internally calls run method
        //when you call start method then tasks run method is called by scheduler
        //started

        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.start();
        t2.start();
//        try {
//            for (int i = 10; i < 20; i++) {
//                System.out.println("        " + i);
//                //Thread.sleep(100);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //how to start the thread
    }
}