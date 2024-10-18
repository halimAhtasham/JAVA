import java.util.Scanner;

public class SeriesSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, sum;
        sum = 0;

        System.out.print("Give last value: ");
        n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            // i = i * i;
            System.out.print(i+"x"+i + " ");
            sum = sum + (i * i);
        }
        System.out.println("\n"+"="+sum);
    }
}
