public class Exercise {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("HelloWorld");
        System.out.println(s.replace(0, 4, " Java"));
        System.out.println(s.append(" New"));
        s.insert(10, "This is");
        System.out.println(s);
        char sb = s.charAt(15);
        System.out.println(sb);
    }
}
