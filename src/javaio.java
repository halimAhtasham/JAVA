import java.io.FileInputStream;
import java.io.FileOutputStream;

public class javaio {
    public static void main(String[] args) {
        try{
            FileInputStream inobj = new FileInputStream("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\input.txt");
            FileOutputStream outobj = new FileOutputStream("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\output.txt");
            int c;
            while((c = inobj.read()) != -1){
                outobj.write(c);
            }
            inobj.close();
            outobj.close();
            System.out.println("Done!");
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
}
