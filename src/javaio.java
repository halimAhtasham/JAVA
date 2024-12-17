import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class javaio {
    public static void main(String[] args) {
        try{
            FileInputStream inobj = new FileInputStream("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\input.txt");
            FileOutputStream outobj = new FileOutputStream("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\output.txt");
            FileReader inputObj = new FileReader("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\myinput.txt");
            FileWriter outputObj = new FileWriter("E:\\Coding\\JAVA\\OverLoading Constructor\\src\\myoutput.txt");
            int c;
            while ((c = inputObj.read()) != -1) {
                outputObj.write(c);
            }
            while((c = inobj.read()) != -1){
                outobj.write(c);
            }
            inobj.close();
            outobj.close();
            inputObj.close();
            outputObj.close();
            System.out.println("Done!");
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
}
