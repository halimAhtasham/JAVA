import java.util.Scanner;

public class NewExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int init, fInal, number, count = 0, total = 0;
        System.out.print("Enter initial: ");
        init = input.nextInt();
        System.out.print("Enter final: ");
        fInal = input.nextInt();
        input.close();
        System.out.println("\n");

        if (init == 0 || init ==1) {
            System.out.println("Error!");
        }
        else {
            for ( number = init; number < fInal; number++) {
                for (int j = 2; j < number; j++) {
                    if (number % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count ==  0) {
                    total++;
                    System.out.print(number+" ");
                }
                count = 0;
            }

            System.out.print("\n"+total);
        }
    }
}
