import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prime, count = 0;
        System.out.println("Enter a positive number: ");
        prime = input.nextInt();
        input.close();

        if (prime == 0 || prime == 1) {
            System.out.println("This is not prime number.");
        }
        else 
        {
            //also can choose only prime
            for (int i = 2; i < prime/2; i++) {
                if (prime % i == 0) {
                    count++;
                    break;
                }
            }
        }

        
        if (count == 0) {
            System.out.println("This is a prime number.");
        }
        else{
            System.out.println("This is not a prime number.");
        }
    }
}
