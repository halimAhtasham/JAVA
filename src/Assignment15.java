//Printing all the sum of odd digit between two given number range


import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, sum;

        while (true) {
        sum = 0;
        System.out.print("Give the range: ");
        m = input.nextInt();
        n = input.nextInt();

        if (m >= n) {
            System.out.println("Make sure the value of m is smaller than n.");
        }
        else
        {
            for (int i = m; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.println("+"+i);
                    sum = sum + i;
                }
            }
            System.out.println("_____"+"="+sum);
            break;
        }
        }
        
        input.close();

    }
}