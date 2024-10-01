import java.util.ArrayList;
// import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 50);
        System.out.println(number);
        for (Integer x : number) {
            System.out.print(x+" ");
        }
        /*Iterator<Integer> itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(" "+itr.next());
            }*/
            System.out.println("\n"+number.size());

            // Remove array list
            /*
            number.remove(2);
            System.out.println(number);
            System.out.println("\n"+number.size());

            number.removeAll(number);
            System.out.println(number);
            System.out.println("\n"+number.size());
            
            number.clear();
            System.out.println("After clear:"+number);
            */

            //Check array list if empty
            boolean check = number.isEmpty();
            System.out.println("1.Arraylist check: "+check);

            // Checking array is containing any value
            boolean contain = number.contains(20);
            System.out.println("2.20 is in the list: "+contain);

            // Checking the position of value
            int pos = number.indexOf(50);
            System.out.println("3.The index of the value: "+pos);

            // Use of Set
            number.set(3, 19);// Replace the value of 3rd index with 19
            System.out.println("4.After the set the value is: "+number);

            // Use of Get
            int Q = number.get(3);// Show the value of 3rd Index
            System.out.println("5. After using Get: "+Q);

    }
}
