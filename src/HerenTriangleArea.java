import java.util.Scanner;

public class HerenTriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double s, a, b, c, area;

        System.out.print("Enter the length of the first side(m):");
        a = input.nextDouble();

        System.out.print("Enter the length of the second side(m):");
        b = input.nextDouble();

        System.out.print("Enter the length of the third side(m):");
        c = input.nextDouble();

        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of this Triangle is: "+area);

        input.close();


    }
}
