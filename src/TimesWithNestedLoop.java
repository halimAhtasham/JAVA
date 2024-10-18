import java.util.Scanner;

public class TimesWithNestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.print("Give value: ");
        m = input.nextInt();
        n = input.nextInt();
        input.close();

        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" x "+j + " = "+i*j);
            }
            System.out.println("\n");
        }
    }
}
