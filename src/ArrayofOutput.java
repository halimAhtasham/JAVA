public class ArrayofOutput {
    public static void main(String[] args) {
        
        int[][] A = new int[4][5];
        int count = 0;

        //Assigning the value to the array
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                A[row][col] = count;
                count++;
            }
            System.out.println();
        }

        // Printing the value of the matrix
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(A[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
