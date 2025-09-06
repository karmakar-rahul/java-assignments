//Program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.Scanner;

public class PositiveNegativeCountZero {
    public static void main( String[] args){
        Scanner sc = new Scanner ( System.in);
        int positives =0,negatives =0,zeros =0;
        char choice = 'y';
        
        while(choice=='y' || choice =='Y'){
            System.out.println("Enter a number :");
            int num =sc.nextInt();

            if (num>0){
                positives++;
            }else if (num<0){
                negatives++;
            }else{
                zeros++;
            }
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        }
        System.out.println("Count of positive numbers: " + positives);
        System.out.println("Count of negative numbers: " + negatives);
        System.out.println("Count of zeros: " + zeros);

    }
}
