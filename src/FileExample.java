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
            PrintWriter p = new PrintWriter(new FileOutputStream("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\info.txt", true));
            // BufferedOutputStream b = new BufferedOutputStream(p);
            // DataOutputStream d = new DataOutputStream(b);
            p.println(name);
            p.println(m1);
            p.println(m2);
            p.println(m3);
            p.println("---------------------------");

            p.close();
            System.out.println("File Saved");
        } catch(IOException e){
            System.out.println("File Error\nDetails: "+e);
        }
        i.close();
    }
}
