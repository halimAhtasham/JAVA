import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = (int)(Math.random()*1000);
        int count = 0;
        System.out.println("Guess the number: ");
        while (true) {
            int x = input.nextInt();
            count++;
            if (x < y) {
                System.out.println("Your guess is lower.");
            }
            else if (x > y) {
                System.out.println("Your guess is higher.");
            }
            else{
                System.out.println("Your guess is correct.");
                break;
            }
        }
        System.out.println("You have tried "+ count+ " times.");
        input.close();
    }
}
