import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, temp, sum = 0, remainder;

        System.out.print("Enter your number: ");
        number = input.nextInt();/// 1234
        input.close();
        temp = number;// 1234

        while (temp != 0) {
            
            remainder = temp % 10; // 1234 % 10= 4  | 123 % 10= 3 | 12 % 10 = 2| 1 % 10 = 1| 0 will not work
            sum = sum + remainder; // 0+4= 4        | 4+3= 7      | 7+2 = 9    | 9+1 = 10
            temp = temp / 10;      // 1234 /10 = 123| 123 /10 = 12| 12 /10 = 1 | 1 /10 = 0
        }
        System.out.println(sum);

    }
}
