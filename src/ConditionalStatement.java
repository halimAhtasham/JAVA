import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter two number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        int large = (num1 > num2)? num1 : num2;

        System.out.println("Large number is: "+large);
    }
}