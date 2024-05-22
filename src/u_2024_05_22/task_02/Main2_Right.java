package u_2024_05_22.task_02;

public class Main2_Right {

    public static int counter2 = 0;

    public static void main(String[] args) throws InterruptedException {

        // TASK 2
        // three threads, each counts to 1 mio, show the end result (expected: 3 Mio)

        //secondary threads, using new version of MyThread with incremental access
        MyThread_Good thread1 = new MyThread_Good();
        MyThread_Good thread2 = new MyThread_Good();

        // start corrected threads
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //main thread
        for (int i = 0; i < 1_000_000; i++) {
            increment();
        }

        System.out.println("Counter equals "+counter2);
    }

    //Add synchronized method
    public static synchronized void increment() {
        counter2++;
    }

}
