package u_2024_05_22.task_01;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        //System.out.println("Utilizing Thread Inheritance...");
        for (int i=100; i<110; i++) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" " + i);
        }
    }
}
