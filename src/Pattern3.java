import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        input.close();

        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
