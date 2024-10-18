import java.util.Scanner;

public class SeriesWithLoop1 {
    public static void main(String[] args) {
        /*
    int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
     */  

    Scanner input = new Scanner(System.in);

    int m, n, sum;
    sum = 0;
    m = input.nextInt();
    n = input.nextInt();
    input.close();

    for (int i = m; i <= n; i++) {
        sum = sum + i;
    }
    System.out.println(sum);
    }
}