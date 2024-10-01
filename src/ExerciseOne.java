import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        // int i;
        // for (i = 0; i < 10; i++) {
        //     System.out.print("hello");
        //     if (i == 6 || i == 8) {
        //         System.out.print("Trump");
        //         break;
        //     }
        //     System.out.println("World");
        // }
        // System.out.println("ExampleBreak");



        /*  int number, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = input.nextInt();
        input.close();
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime.");
        }
        */


        
        Scanner input = new Scanner(System.in);
        int initial, Final;

        System.out.print("Enter initial: ");
        initial = input.nextInt();
        System.out.print("Enter final: ");
        Final = input.nextInt();
        input.close();

        int total = 0;

        for (int i = initial; i <= Final; i++) {
            int temp = i;
            int sum = 0;
            int digits = 0;

            // Count the number of digits
            while (temp != 0) {
                digits++;
                temp = temp / 10;
            }

            temp = i;

            // Calculate the sum of the powers of the digits
            while (temp != 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, digits);
                temp = temp / 10;
            }

            // Check if the sum is equal to the original number
            if (sum == i) {
                total++;
                System.out.println(i);
            }
        }
        
        System.out.println("Total Armstrong numbers: " + total);
    }
}