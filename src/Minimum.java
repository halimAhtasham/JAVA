public class Minimum {
    public static void main(String[] args) {
        int [] a = {10, 70, 3, 67, 100, 2, 30, 4, 55, 104, 170, 508, 8, -2, -70, -3, -101};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
