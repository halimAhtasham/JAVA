// import java.util.Scanner;

public class MatrixOutput {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int[][] A = new int[4][4];
        int count= 0 ;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <= row; col++) {
                A[row][col] =  count;
                count++;
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(A[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
