import java.util.Scanner;

public class ArrayTwoMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;

        System.out.print("Please! Enter 5 number: ");
        // number[0] = input.nextDouble();
        // number[1] = input.nextDouble();
        // number[2] = input.nextDouble();
        // number[3] = input.nextDouble();
        // number[4] = input.nextDouble();

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        // sum = number[0] +number[1] + number[2] + number [3] + number[4];
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+sum/number.length);
        double max = number[0];
        double min = number[0];
        for (int j = 1; j < number.length; j++) {
            if (max < number[j]) {
            max = number[j];
        }
            if (min > number[j]) {
            min = number[j];
        }
    }
    System.out.println("Maximum number: "+max);
    System.out.println("Minimum number: "+min);
    input.close();

    }
}
