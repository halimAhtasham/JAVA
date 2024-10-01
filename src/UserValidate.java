import java.util.Scanner;

public class UserValidate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, password, ActualName = "Ahtasham Halim Rifat", ActualPassword = "abcd123";

        while (true) {
            
            System.out.println("Enter you name: ");
            name = input.nextLine();
            System.out.println("Enter your password: ");
            password = input.nextLine();
    
            if (name.equals(ActualName) && password.equals(ActualPassword)) {
                System.out.println("Welcome to the system");
                break;
            }
            else{
                System.out.println("User/Password incorrect. Try again.");
            }
        }
        input.close();
    }
}
