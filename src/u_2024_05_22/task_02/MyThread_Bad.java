package u_2024_05_22.task_02;

public class MyThread_Bad extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            Main2_Fail1.counter2++;
        }
    }
}
