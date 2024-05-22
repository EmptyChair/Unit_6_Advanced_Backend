package u_2024_05_22.task_01;

public class Main1_Fail {
    public static void main(String[] args) {

        // TWO METHODS TO CREATE THREADS IN JAVA
        // 1. inherit class Thread
        // 2. realize interface Runnable

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        // This is WRONG! No multithreading this way - the processes are executed one after another
        // thus the threads are executed one after another
        myThread1.run();
        myThread2.run();

        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" " + i +" seconds.");
        }
    }
}
