// import java.util.Scanner;

public class ArrayThreeForEac {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        /* 
        String[] names = new String[4];
        String[] names = {"Ahtasham", "Iftisham", "Humayra", "Nayim"};
        names[0] = "Ahtasham";
        names[1] = "Iftisham";
        names[2] = "Humayra";
        names[3] = "Nayim";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (String x : names) {
            System.out.println(x);
        }
        */ 

        int[] number = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        for (int x : number) {
            sum = sum + x;
        }
        System.out.println(number.length);
        System.out.println(sum);

    }
}
