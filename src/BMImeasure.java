import java.util.Scanner;

public class BMImeasure {
    public static void main(String[] args) {
        double height, weight, BMI;
        Scanner input = new Scanner(System.in);

        System.out.println("Give your Height(meter): ");
        height = input.nextDouble();

        System.out.println("Give your Weight(kg): ");
        weight = input.nextDouble();

        input.close();

        BMI = weight / (height * height);
        if (BMI >= 25) {
            System.out.println("You are overweight.");
        }
        else if (BMI <= 18) {
            System.out.println("You are underweight.");
        }
        else {
            System.out.println("You are healthy, good job.");
        }
    }
}
