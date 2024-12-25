public class Maximum {
    public static void main(String[] args) {
        int [] a = {10, 70, 3, 67, 100, 2, 30, 4, 55, 104, 170, 508, 8};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
