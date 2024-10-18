import java.util.Scanner;

public class StirngPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String newStr , reverseStr;
        System.out.println("Give String: ");
        newStr = input.nextLine();

        StringBuffer alternativeStr = new StringBuffer(newStr);

        reverseStr = alternativeStr.reverse().toString();


        if (newStr.equals(reverseStr)) {
            System.out.println("It is palindrome.");
        }
        else {
            System.out.println("It is not palindrome.");
        }
        input.close();

    }
}
