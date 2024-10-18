//Printing factorial number
import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        int fact, i;

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Give a number: ");
        i = input.nextInt();
        fact = 1;
        // for (int j = 1; j <= i; j++) {
        //     fact = fact * j;
        // }
        for (int j = i; j >= 1; j--) {
            fact = fact * j;
        }
        System.out.print("Factorial of " +i + " is: "+fact);
        // System.out.println(fact);
    }
}
