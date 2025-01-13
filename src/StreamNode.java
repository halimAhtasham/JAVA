import java.util.Arrays;

public class StreamNode {
    public static void main(String[] args) {
        for (int i = 0; i <= 1; i++) {
            System.out.println("StreamNode");
        }
        int [] a = {1, 2, 3, 4, 5};
        String [] str = {"One", "Two", "Three", "Four", "Five"};
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(a));
        for (int i : a) {
            System.out.print(i+ " ");
        }
        System.out.print("\nhello");
    }
}