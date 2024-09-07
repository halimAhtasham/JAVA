import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculatorProgram calculator = new CalculatorProgram();

        System.out.println("Enter two numbers: ");
        calculator.a = input.nextDouble();
        calculator.b = input.nextDouble();

        double Add = calculator.add();
        double Subtraction = calculator.sub();
        double Multiplication = calculator.mul();
        double Division = calculator.div();

        System.out.println("Addition: "+Add);
        System.out.println("Subtraction: "+Subtraction);
        System.out.println("Multiplication: "+Multiplication);
        System.out.println("Division: "+Division);

        input.close();
    }
}
