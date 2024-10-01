import java.util.Scanner;

public class PrimeNumberLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, count = 0, NumberOfPrime = 0;
        System.out.println("Give a range: ");
        m = input.nextInt();
        n = input.nextInt();
        input.close();
        for (int i = m; i <= n; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
    
                if (count == 0) {
                    NumberOfPrime++;
                    System.out.print(i+" ");
                }
                count = 0;
            }
            System.out.println("\n"+ ""+NumberOfPrime);
        }
    }
