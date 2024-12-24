import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class EvenNumberFile {
    public static void main(String[] args) {
        String msg = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                msg = i + " ";
            }
        }
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\myfile.txt", true));
            p.println(msg);
            JOptionPane.showMessageDialog(null, "Saved");
            p.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
