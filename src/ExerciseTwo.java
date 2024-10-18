import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] number = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Number[%d][%d]=",row,col);
                number[row][col]=input.nextInt();
            }
        }
        System.out.println("The matrix is: \n");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(number[row][col]+"\t");
            }
            System.out.println();
        }

        
        input.close();

    }
}
