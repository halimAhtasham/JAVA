import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
       /* 
       Scanner input = new Scanner(System.in);

        int initial, finalvalue, count = 0, total = 0;

        System.out.println("Give initial and final value. Don't start with 1.");
        initial = input.nextInt();
        finalvalue = input.nextInt();
        input.close();

        for (int Number = initial; Number < finalvalue; Number++) {
            for (int Divisor = 2; Divisor < Number; Divisor++) {
                if (Number % Divisor == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                total++;
                System.out.print(Number+" ");
            }
            count = 0;
        }
        System.out.println("\nTotal" + "="+total);
       
       */ 



        Scanner input = new Scanner(System.in);

        /*
        Prime Number
        int m, n, count = 0, total= 0;
        System.out.print("Give m:");
        m = input.nextInt();
        System.out.print("Give n:");
        n = input.nextInt();
        input.close();
            if (m == 0 || m == 1) {
                System.out.println("Error");
            }
            else {
                for (int i = m; i <=n ; i++) {
                    for (int j = 2; j < i ; j++) {
                        if (i % j == 0) {
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        total++;
                        System.out.print(i+" ");
                    }
                    count = 0;
                }
                System.out.println("\n="+total);
            }
            */
        
            // PalindromeTriangle
            System.out.print("Enter n: ");
            int n = input.nextInt();
            input.close();
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n-row; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print(col);
                }
                for (int col = row-1; col >= 1; col--) {
                    System.out.print(col);
                }
                System.out.println();
            }
    }
    
}
