package JavaThreads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo {

    public static void main(String[] args) {
        ThreadExtendingClass testThread1 = new ThreadExtendingClass("Thread1");
        ThreadExtendingClass testThread2 = new ThreadExtendingClass("Thread2");
        testThread1.start(); //ruft indirekt run auf
        testThread2.start();
        //Thread mit LambdaAusdruck
        Thread test = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + ": ThreadExtendingClass  i = " + i);
            }
        }, "ThreadLambda");
        test.start();
        //CylceThread
        Thread testCycleThread = new Thread(() -> {
            System.out.println("testCycleThread state: running");
            try {
            Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("testCycleThread state: completed"); });
        testCycleThread.start();
        try {
            Thread.sleep(1000);
            System.out.println("testCycleThread state: " + testCycleThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            testCycleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AtomicInteger atomicCounter = new AtomicInteger(0);
        Thread test2 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                atomicCounter.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + ": ThreadExtendingClass  i = " + atomicCounter);
            }
        }, "ThreadAtomic");
        test2.start();

    }
}
