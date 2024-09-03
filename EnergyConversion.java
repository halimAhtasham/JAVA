import java.util.Scanner;

public class EnergyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double M, C, t2, t1, Q;

        System.out.print("Enter your initial temperature(kelvin): ");
        t1 = input.nextDouble();

        System.out.print("Enter your final temperature(kelvin): ");
        t2 = input.nextDouble();

        System.out.print("Enter the mass of your object(kg): ");
        M = input.nextDouble();

        System.out.print("Enter the specific heat needed for this object: ");
        C = input.nextDouble();

        Q = M * C * (t2 - t1);

        System.out.println("The Energy (Heat) needed to raise temperature of this object is: "+Q + "j");

        input.close();
    }
}
