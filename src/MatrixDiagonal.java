import java.util.Scanner;

public class MatrixDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] A = new int[3][3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;

        // Input A matrix from user
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]=",row,col);
                A[row][col] = input.nextInt();
            }
        }
        System.out.println();
        // Printing A matrix
        System.out.println("Matrix A: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("  "+A[row][col]);
                if (row == col) {
                    sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
                }
                if (row < col) {
                    sumOfUpperElements = sumOfUpperElements + A[row][col];
                }
                if (row > col) {
                    sumOfLowerElements = sumOfLowerElements + A[row][col];
                }
            }
            System.out.println();
        }
        System.out.println("\nSum of the Diagonal Elements: "+sumOfDiagonalElements);
        System.out.println("Sum of the Upper Triangle Elements: "+sumOfUpperElements);
        System.out.println("Sum of the Lower Triangle Elements: "+sumOfLowerElements);
        input.close();
    }
}
