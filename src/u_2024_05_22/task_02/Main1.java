package u_2024_05_22.task_02;

public class Main1 {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        // TASK 1
        // Counter, starting with 0
        // increase counter by 1, 1mln times
        // and then show counter
        for (int i = 0; i < 1_000_000; i++) {
            counter++;
        }
        System.out.println("Counter equals "+counter);
    }
}
