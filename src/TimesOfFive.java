import java.util.Scanner;

public class TimesOfFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, NewNumber;
        System.out.print("Give value: ");
        number = input.nextInt();
        input.close();


        for (int i = 1; i <= 10; i++) {
            NewNumber = number * i;
            System.out.println(number+" x "+i + " = "+NewNumber);
        }
        
    }
}