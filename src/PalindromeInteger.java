import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, temp, remainder, sum = 0;

        System.out.println("Enter your number: ");
        number = input.nextInt();
        input.close();

        temp = number;

        while (temp != 0) {
            remainder = temp % 10;
            sum = sum * 10 + remainder;
            temp = temp /10;
        }
        if (sum == number) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
