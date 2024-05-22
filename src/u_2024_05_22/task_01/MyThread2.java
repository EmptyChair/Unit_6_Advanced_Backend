package u_2024_05_22.task_01;

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        //System.out.println("Utilizing Runnable Implementation...");
        for (int i=10000; i<10010; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" " + i);
        }
    }
}
