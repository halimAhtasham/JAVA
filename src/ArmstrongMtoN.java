import java.util.Scanner;

public class ArmstrongMtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initial, Final, temp, remainder, sum = 0, total = 0;

        System.out.print("Enter initial: ");
        initial = input.nextInt();
        System.out.print("Enter final: ");
        Final = input.nextInt();
        input.close();

        for (int i = initial; i <= Final; i++) {
            
            temp = i;
    
            while (temp != 0 && i >= 10) {
                remainder = temp % 10;
                sum = sum + remainder * remainder * remainder;
                temp = temp / 10;
            }
            if (sum == i) {
                total++;
                System.out.println(i);
            }
            sum = 0;
        }
        System.out.println(total);
    }
}
