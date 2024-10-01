import java.util.Scanner;

public class FibonacciExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which fibonacci number you want to see: ");
        int n = input.nextInt();
        input.close();

        int first = 0;
        int second = 1;
        int fibonacci = 0;
        if (n == 1) {
            System.out.println(first);
        }
        else if (n == 2) {
            System.out.println(second);
        }
        else {
            for (int i = 3; i <= n; i++) {
                fibonacci = first + second;
                first = second;
                second = fibonacci;
            }
            System.out.println(fibonacci+" ");

        }
        
    }
}