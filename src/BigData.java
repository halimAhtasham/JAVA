import java.math.BigInteger;
import java.util.Scanner;

public class BigData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        BigInteger num1 = BigInteger.valueOf(1024).pow(i);
        System.out.println(num1);
        input.close();
    }
}
