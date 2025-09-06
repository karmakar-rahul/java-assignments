import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                count[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        System.out.println("Currency Note Count:");
        for (int i = 0; i < notes.length; i++) {
            if (count[i] != 0) {
                System.out.println(notes[i] + " : " + count[i]);
            }
        }
    }
}
