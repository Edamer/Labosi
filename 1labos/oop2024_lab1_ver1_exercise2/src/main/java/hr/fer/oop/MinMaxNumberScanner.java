package hr.fer.oop;

import java.util.Scanner;

public class MinMaxNumberScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        if (a < -100 || a > 100) {
            System.out.println("No Min/Max");
        } else {
            while (a < 101 && a > -101) {

                if (a <= min) {
                    min = a;
                }
                if (a >= max) {
                    max = a;
                }
                a = sc.nextInt();
            }
            System.out.printf("%d %d\n", min, max);
        }

    }

}
