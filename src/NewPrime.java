import java.util.Scanner;

public class NewPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int flag = 0, count = 0;
        for (int i = x; i <= y; i++) {
            if (i < 2) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
                count++;
            }
            flag = 0;
        }
        System.out.println("\nTotal Prime Number between " + x + " and "+ y + ": "+count);
        input.close();
    }
}
