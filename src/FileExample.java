import java.util.*;
import java.io.*;
public class FileExample {
    public static void main(String[] args) throws IOException {
        Scanner i = new Scanner(System.in);
        String name;
        double m1, m2, m3;
        System.out.println("Enter your name and 3 numbers: ");
        name = i.nextLine();
        m1 = i.nextDouble();
        m2 = i.nextDouble();
        m3 = i.nextDouble();

        try{
            PrintWriter f = new PrintWriter("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\info.txt");
            // BufferedOutputStream b = new BufferedOutputStream(f);
            // DataOutputStream d = new DataOutputStream(b);
            f.println(name);
            f.println(m1);
            f.println(m2);
            f.println(m3);
            f.close();
            System.out.println("File Saved");
        } catch(IOException e){
            System.out.println("File Error\nDetails: "+e);
        }
        i.close();
    }
}
