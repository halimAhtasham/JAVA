import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = input.nextInt();
        input.close();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            } 
                
            for (int col = row-1; col >= 1; col--) {
                    System.out.print(col);
                }
            
            System.out.println();
        }
    }
}
