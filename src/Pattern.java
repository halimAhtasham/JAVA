import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n = input.nextInt();
        input.close();


        // 3 3 3
        // 2 2
        // 1
        for (int row = n; row >= 1; row--) {
            System.out.print("r");
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}