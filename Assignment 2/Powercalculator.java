import java.util.Scanner;

public class Powercalculator {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base number :");
    int base = sc.nextInt();
    System.out.println("Enter the  exponent :");
    int exp=sc.nextInt();
    long result = 1;
    for(int i=1;i<=exp; i++){
        result*=base;
    }
    System.out.println(base + " raised to the power "+ exp + "="+ result);
    }
}
