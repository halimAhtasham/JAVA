import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaMethod {
    public static void main(String[] args) {

        // Date Method
        Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        // String currentDate = dateFormat.format(date);
        // System.out.println("Current Date: "+currentDate);
        System.out.println("Current Date(date method): "+dateFormat.format(date));


        // Time Method
        LocalTime time = LocalTime.now();
        System.out.println("Current time(time method):"+time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        // String formatedTime = time.format(formatter);
        // System.out.println("Current time: "+formatedTime);
        System.out.println("Current time: "+time.format(formatter));
    }
}