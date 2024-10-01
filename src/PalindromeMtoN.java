import java.util.Scanner;

public class PalindromeMtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int initial, Final, temp, remainder, sum = 0, total = 0;

        System.out.print("Enter your initial: ");
        initial = input.nextInt();
        System.out.print("Enter your final: ");
        Final = input.nextInt();
        input.close();

        // if (initial < 10 && initial >= 0) {
        //     System.out.println("Error");
        // }
        // else{
        // }
        for (int i = initial; i <= Final; i++) {
            
            temp = i;
            while (temp != 0 && i >= 10) {
                remainder = temp % 10;
                sum = sum * 10 + remainder;
                temp = temp /10;
            }
            if (sum == i) {
                total++;
                System.out.println(sum);
            }
            sum = 0;
        }
        System.out.println("Total= "+total);
    }
}

