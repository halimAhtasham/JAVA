import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] number = new int[7];

        // Taking Output from the user
        for (int row = 0; row < number.length; row++) {
            System.out.printf("Number[%d]=", row);
            number[row] = input.nextInt();
        }
        Arrays.sort(number); // Sorting

        // Printing
        System.out.println("Ascending: "); 
        for (int row = 0; row < number.length; row++) {
            System.out.print(number[row]+" ");
        }
        System.out.println("\nDescending: ");
        for (int row = 6; row >= 0; row--) {
            System.out.print(number[row]+" ");
        }
        input.close();
    }
}
