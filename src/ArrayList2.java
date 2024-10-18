import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        System.out.println("NumberIs: "+number);

        number1.add(50);
        number1.add(60);
        number1.add(70);
        number1.add(80);
        System.out.println("Number 1: "+number1);

        number2.add(11);
        number2.add(22);
        number2.add(33);
        number2.add(44);
        System.out.println("Number 2: "+number2);

        // Use of ADD All method
        number3.addAll(number1);
        System.out.println("Number 3: "+number3+"--Add All");

        // Use of Equal Method
        boolean x = number.equals(number3);
        System.out.println("Number == Number 3: "+x);
    }
}
