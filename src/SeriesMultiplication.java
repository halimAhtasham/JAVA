import java.util.Scanner;

public class SeriesMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, multi = 1;

        System.out.print("Enter range: ");
        n = input.nextInt();
        input.close();

        /*
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
            multi = multi * i;
        }
        System.out.println("\n"+"="+multi);
        */

        for (int i = 1; i <= n; i++) {
            System.out.print(i+"x"+i +" ");
            multi = multi * (i*i);
        }
        System.out.println("\n"+"="+multi);
    }
}
