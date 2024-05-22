package u_2024_05_22.task_02;

public class Main2_Fail1 {

    public static int counter2 = 0;

    public static void main(String[] args) throws InterruptedException {
        // TASK 2
        // three threads, each counts to 1 mio, show the end result (expected: 3 Mio)

        //secondary threads
        MyThread_Bad thread1 = new MyThread_Bad();
        MyThread_Bad thread2 = new MyThread_Bad();

        //ATTEMPT 1
        //PROBLEM with following! Main2_Right Thread doesn't wait for other threads to finish!!!

        thread1.start();
        thread2.start();

        //main thread
        for (int i = 0; i < 1_000_000; i++) {
            counter2++;
        }
        System.out.println("Counter2 equals "+counter2);

    }
}
