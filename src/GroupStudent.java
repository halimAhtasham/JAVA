import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroupStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total number of students: "); // getting the size
        int total = in.nextInt();

        System.out.println("Enter the roll of the students: ");
        ArrayList<Integer> students = new ArrayList<Integer>(); // added Rolls in the ArrayList
        for (int i = 0; i < total; i++) {
            students.add(in.nextInt());
        }

        Collections.shuffle(students);// shuffling students in the groups

        System.out.println("How many groups do you want to make?");
        int groups = in.nextInt(); // total groups

        System.out.println("What is your group size?");
        int groupSize = in.nextInt(); // no of students in each group
        int remaining = total % groups;
        int index = 0;

        for (int i = 0; i < groups; i++) {  // Storing Rolls in the groups 
            System.out.println("Group " + (i + 1) + ": ");
            for (int j = 0; j < groupSize; j++) {
                System.out.println(students.get(index++) + " ");
            }
            System.out.println();
        }

        if(remaining > 0){ // left over students
            System.out.println("Remaining students are: ");
            for (int i = 0; i < remaining; i++) {
                System.out.println(students.get(index++) + " ");
            }
        }
        in.close();
    }
}