public class CodeBlock {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        for (x = 1; x <= 10; x++) {
            System.out.println("The value of x: " +x);
            System.out.println("The value of y: " +y);
            y-=2;
        }
    }
}
