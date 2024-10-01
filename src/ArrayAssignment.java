import java.util.Scanner;

public class ArrayAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] weekdays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.print("Enter day number(1-7): ");
        int day = input.nextInt();
        for (int i = 0; i < weekdays.length; i++) {
            if (day == i+1) {
                System.out.println(weekdays[i]);
            }
        }
        input.close();
    }
}