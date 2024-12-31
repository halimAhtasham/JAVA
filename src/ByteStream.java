import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ByteStream {
    public static void main(String[] args) {
        String msg = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name and ID:");
        String name = in.nextLine();
        String id = in.nextLine();
        msg = "Name: " + name + "\nID: " + id;
        System.out.println("Name and ID saved in msg file.");
        try{
            FileOutputStream f = new FileOutputStream("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\myfile.txt", true);
            // BufferedOutputStream b = new BufferedOutputStream(f);
            // DataOutputStream d = new DataOutputStream(b);
            PrintWriter p = new PrintWriter(f);
            p.println(msg);
            p.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        in.close();
    }
}
