import java.util.Scanner;

public class EvenNumberLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m , n, sum;
        sum = 0;

        System.out.print("Give two number range: ");
        m = input.nextInt();
        n = input.nextInt();
        input.close();

        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("+"+i);
                sum = sum + i;
                System.out.println(sum);
            }
        }
    }
}
