import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(-20);
        number.add(30);
        number.add(100);
        number.add(9);
        number.add(18);


        // ArrayList Sorting

        // Ascending Sorting
        Collections.sort(number);
        System.out.println("Ascending: "+number);
        
        // Descending Sorting
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Descending: "+number);
    }
}
