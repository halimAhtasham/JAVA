import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [][] A = new int [2][3];
        int [][] B = new int [2][3];
        int [][] C = new int [2][3];
        
        // Input A matrix from user
        System.out.println("Enter A matrix:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] =",row,col);
                A[row][col] = input.nextInt();
            }
        }
        // Input B matrix from User
        System.out.println("Enter B matrix:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] =",row,col);
                B[row][col] = input.nextInt();
            }
        }

        // Printing A matrix
        System.out.println("\nMatrix A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+A[row][col]);
            }
            System.out.println();
        }

        System.out.println("\n");


        // Printing B matrix
        System.out.println("Matrix B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+B[row][col]);
            }
            System.out.println();
        }

        // Summation of the Two Matrix
        System.out.println("\nSummation of A and B=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] + B [row][col];
                System.out.print("\t "+C[row][col]);
            }
            System.out.println();
        }
        input.close();
    }
}
