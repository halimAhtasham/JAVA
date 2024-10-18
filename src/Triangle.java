import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int row, col, n;
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
        
        /*
        // Pattern One: Arrow Right Side
        for ( row = 1; row <= n; row++) {
            for ( col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        for ( row = n-1; row >= 1; row--) {
            for ( col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        */
        
        /*
        // Pattern Two: Arrow Left Side
        for ( row = 1; row <= n; row++) {
            for ( col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for ( col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        for ( row = n-1; row >= 1; row--) {
            for ( col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for ( col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        */

        /*
        Multiplication Table; Pattern Three 
        for ( row = 1; row <= n; row++) {
            for ( col = 1; col <= row; col++) {
                System.out.print(row*col+" ");
            }
            System.out.println();
        }
        */

        /*
        Pyramid Pattern Pattern Four
        for ( row = 0; row <= n; row++) {
            for ( col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for ( col = 1; col <= row ; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
        for ( row = 0; row <= n; row++) {
            for ( col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for ( col = 1; col <=2 * row - 1 ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        */

        /*
        Palindrome; Pattern Five
        for ( row = 1; row <= n; row++) {
            for ( col = 1; col <= n-row; col++) {
            System.out.print(" ");
            }
            for ( col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for ( col = row -1; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
         */

        /*
        Heart ;Pattern Six
        for ( row = 0; row <= 5; row++) {
            for ( col = 0; col <= 6; col++) {
                if ((row == 0 && col%3!=0)|| (row ==1 && col%3==0)|| (row-col==2) || (row+col==8)) {
                    System.out.print("***");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        */

        /*
        Pattern Seven: X Shape
        for ( row = 1; row <= n; row++) {
            for ( col = 1; col <= n; col++) {
                if ((row == col)|| (row+col == n+1)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */


        // Pattern Eight: Triangle Shape
        for ( row = 1; row <= n; row++) {
            for ( col = 1; col <= n; col++) {
                if (col == 1 || row == col || row ==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
