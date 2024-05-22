package u_2024_05_22.task_01;

public class Main2_Right {
    public static void main(String[] args) {

        // TWO METHODS TO CREATE THREADS IN JAVA
        // 1. inherit class Thread
        // 2. realize interface Runnable

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        // This is RIGHT
        // method start, inherited from class Thread, allows for multithreading

        myThread1.start();

        // Create an Object of class Thread and put myThread2 into Thread constructor
        // then this new object can utilize method start
        // this method is usable if our class already extends some other class
        // multiple inheritance is forbidden in Java)
        // thus combining inheritance and interface
        Thread thread = new Thread(myThread2);
        thread.start();


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


