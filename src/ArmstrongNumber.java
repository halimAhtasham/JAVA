import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, temp, remainder, sum = 0;

        System.out.println("Enter num: ");
        number = input.nextInt();
        input.close();

        temp = number;

        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + remainder * remainder * remainder;
            temp = temp / 10;
        }
        if (sum == number) {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
