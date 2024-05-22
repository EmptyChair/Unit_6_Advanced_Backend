package u_2024_05_22.task_02;

public class Main2_Fail2 {

    public static int counter2 = 0;

    public static void main(String[] args) throws InterruptedException {
        // TASK 2
        // three threads, each counts to 1 mio, show the end result (expected: 3 Mio)

        //secondary threads
        MyThread_Bad thread1 = new MyThread_Bad();
        MyThread_Bad thread2 = new MyThread_Bad();

        //ATTEMPT 2: Joining threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // FAILURE!
        // проблема общего доступа к ресурсу - три процесса вразнобой считывают-изменяют и записывают значения,
        // из-за чего счётчик по факту замедляется, когда одно и то же значение записывается много раз

        System.out.println("Counter equals "+counter2);
    }
}
