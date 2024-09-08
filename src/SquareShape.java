import java.util.Scanner;

public class SquareShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        Square shape = new Square();
        System.out.print("Enter the side of the square: ");
        shape.side = input.nextDouble();
        double GivenArea = shape.area();
        System.out.println("The area of the square is: "+GivenArea);
        input.close();
    }
}
