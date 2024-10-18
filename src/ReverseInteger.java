import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, remainder, sum = 0, temp;

        System.out.print("Enter a Integer: ");
        number = input.nextInt();  // 1234
        input.close();

        temp = number;

        while (temp != 0) {
            remainder = temp % 10;     // 1234 % 10= 4  | 123 % 10 = 3    | 12 % 10 = 2       | 1 % 10 = 1        | lOOP ends here
            sum = sum * 10 + remainder;// 0 * 10 + 4= 4 | 4 * 10 + 3= 43  | 43 * 10 + 2 = 432 | 432 * 10 + 1= 4321 
            temp = temp / 10;          // 1234 /10= 123 | 123 /10= 12     | 12 /10= 1         | 1 /10= 0
        }
        System.out.println(sum);
    }
}
