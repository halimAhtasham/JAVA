import java.io.*;

public class PrimeNumberSaving {
    public static void main(String[] args) {
        boolean flag;
        String msg = "";
        for (int i = 1; i <= 100; i++) {
            if (i < 2) {
                continue;
            }
            flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                msg += i + " ";
            }
        }
        try{
            // FileOutputStream f =  new FileOutputStream("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\myfile.txt");
            // BufferedOutputStream b = new BufferedOutputStream(f);
            // DataOutputStream d = new DataOutputStream(b);
            FileWriter f =  new FileWriter("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\myfile.txt");
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter d = new PrintWriter(b);
            d.print(msg);
            d.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
