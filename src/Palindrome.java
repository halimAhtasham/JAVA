import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int remainder, sum = 0;
        while (temp > 0){
            remainder = temp % 10;
            sum = (sum * 10) + remainder;
            temp = temp / 10;
        }
        if(num == sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        input.close();
    }
}
