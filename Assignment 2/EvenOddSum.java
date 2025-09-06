//Program that takes the sum of even and odd integers

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter the amount of numbers you want to input: ");
        int n = sc.nextInt();
        
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter"+ n + "numbers");
        for ( int i=1;i<=n; i++){
            int num = sc.nextInt();
            if(num%2==0){
                evenSum += num;
            }else{
                oddSum += num;
            }
        }
        System.out.println("Sum of even numbers="+evenSum);
        System.out.println("Sum of odd numbers="+oddSum);

    }
}
