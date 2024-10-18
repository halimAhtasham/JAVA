import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many number you want to see: ");
        int nthNumber = input.nextInt();
        input.close();

        int first = 0;
        int second = 1;
        int Fibonacci;
        System.out.print(first+" "+second);

        for (int i = 3; i <= nthNumber; i++) {
            Fibonacci = first + second;
            System.out.print(" "+Fibonacci);  // 0 1 1 2 3 5 8 
            first = second;
            second = Fibonacci;
        }
    }
}
