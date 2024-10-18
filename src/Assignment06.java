import java.util.Scanner;

public class Assignment06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        int value;
        System.out.println("Choose a value: ");
        value = input.nextInt();

        switch (value) {
            case 1:
                System.out.println("Bangla.");
                break;
            case 2:
                System.out.println("English.");
                break;
            case 3:
                System.out.println("Hindi");
                break;

            default:
            System.out.println("Spanish.");                                                     
                break;
        }
    }
}
