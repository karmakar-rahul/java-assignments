//Program to print multiplication table of 10 in reverse order.
public class ReverseTable10 {
    public static void main(String[] args){
        int number = 10;
        System.out.println("Multiolication table of" + number + "in reverse order");
        for(int i =10;i>=1;i--){
            System.out.println(number+"X" + i + "=" +(number*i));
        }
    }
    
}
