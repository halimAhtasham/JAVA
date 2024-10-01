public class SumWithLoop {
    public static void main(String[] args) {
        int i, sum;
        sum = 0;
        for (i = 1; i<=10; i++) {
            sum = sum + i;
            System.out.println("+ "+i);
        }
        System.out.println("= " +sum);
    }
}
