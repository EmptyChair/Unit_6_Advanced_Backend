package u_2024_05_22.homework;

/*
    Дан диапазон чисел: от 1 до 2_000_000 включительно.
    Задача: найти, сколько чисел из этого диапазона делятся нацело на 21 и при этом содержат цифру 3.
    Решить данную задачу в один поток.
    Решить данную задачу в два потока, разделив между потоками заданный диапазон чисел пополам.
    Сравнить результаты двух решений - они должны совпадать.
 */

public class Main_One_Thread {
    // One-Thread Solution

    private static int count = 0;
    public static void main(String[] args) {
        System.out.println("Looking for the amount of numbers between 1 and 2_000_000 which:");
        System.out.println("- are divisible by 21");
        System.out.println("- contain digit 3");
        for (int i = 1; i<=2_000_000; i++) {
            if (i%21 == 0 && threeCheck(i) == true ) {
                count++;
            }
        }
        System.out.println("The number of such numbers in the given range equals "+count);
    }

    public static boolean threeCheck(int x) {
        while (x!=0) {
            if (x%10 == 3) {
                return true;
            }
            // exploit integer limitations
            x = x/10;
        }
        return false;
    }
}
