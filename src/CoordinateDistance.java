import java.util.Scanner;

public class CoordinateDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1, x2, y1, y2, d;
        System.out.print("Enter x1: ");
        x1 = input.nextDouble();

        System.out.print("Enter x2: ");
        x2 = input.nextDouble();

        System.out.print("Enter y1: ");
        y1 = input.nextDouble();

        System.out.print("Enter y2: ");
        y2 = input.nextDouble();

        d = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));

        System.out.println("Distance between two Co-ordinates(Cartesian Method): "+d);

        input.close();
    }
}
