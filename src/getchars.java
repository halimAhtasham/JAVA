public class getchars {
    public static void main(String[] args) {
        String s1 = "My Bangladesh";
        char [] c = new char[10];
        s1.getChars(0, 5, c, 3);
        int i = 0;
        for (char d : c) {
            ++i;
            System.out.println(i+" "+d);
        }
    }
}
