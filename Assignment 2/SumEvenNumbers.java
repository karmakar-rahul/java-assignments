//Writing a program to sum first n even numbers using a while loop.

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many even numbers you want to sum");
        double n = sc.nextDouble();
        double sum = 0;
        double i = 1;
        int count = 0;

        while (count < n) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        }

        System.out.println("Sum of first " + n + " even numbers = " + sum);
    }
}
