package ua.ithillel.java;

public class Cycle {
    public static void main(String[] args) {

        System.out.println("\nTask one:\n");

        for (int i = 0; i <= 100; i++) {
            if (i == 13) {
                continue;
            }
            if (i == 66) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\nTask two:\n");

        int k = 1;
        for (int i = 1; i < 100; i++) {
            k *= i;
            if (k >= 1000)
                break;
            System.out.println(k);
        }
    }
}
