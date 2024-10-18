import java.util.Scanner;

public class SeriesDef1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, sum;
        sum = 0;
        System.out.print("Enter last digit: ");
        n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            System.out.print(" "+i);
            sum = sum + i;
        }
        System.out.println("\n"+"="+sum);

        //Difference 2
        
       /*
       for (int i = 1; i <= n; i+=2) {
            System.out.print(" "+i);
            sum = sum + i;
        }
        System.out.println("\n"+"="+sum); 
       */ 
    }
}
