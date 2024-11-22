import java.util.Scanner;
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, row, col, count = 0;
        System.out.print("Enter n:");
        n = input.nextInt();
        input.close();
        for ( row = 1; row <= n; row++) {
            for ( col = 1; col <= row; col++) {
                System.out.print(++count +" ");
            }
            System.out.println();
            
        }
    }
}
