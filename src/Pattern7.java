// pyramid Triangle Shape
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        input.close();

        for (int row = 1; row <= n; row++) {
            // Printing Space
            for (int col = 1; col <=n-row; col++) {
                System.out.print(" ");
            }
            // Printing Elements
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
