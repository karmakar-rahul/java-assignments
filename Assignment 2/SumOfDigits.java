//Program to find the sum of digits of a number.
import java.util.Scanner;

public class SumOfDigits {
    public static void main ( String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num/10;
        }
        System.out.println("The sum of digits of " + originalNum + " is: " + sum);
    }
}
