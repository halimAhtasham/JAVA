import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        input.close();

        //Pattern type 1
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

        //Pattern type 2


        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col%2+" ");
            }
            System.out.println();
        }
    }
}
