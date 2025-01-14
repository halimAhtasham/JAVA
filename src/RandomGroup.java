import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomGroup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> students = new ArrayList<Integer>();
        System.out.println("Enter the total number of students: ");
        int size = in.nextInt();
        System.out.println("Enter the roll numbers of the students:");
        for (int i = 0; i < size; i++) {
            students.add(in.nextInt());
        }
        Collections.shuffle(students);
        System.out.println("How many groups do you want to make?");
        int grs = in.nextInt();

        int groupSize = size / grs;
        int remaining = size % grs;
        int index = 0;
        for (int i = 0; i < grs; i++) {
            System.out.println("Group " + (i + 1) + ":");
            for (int j = 0; j < groupSize; j++) {
                System.out.println(students.get(index++) + " ");
            }
            System.out.println();
        }
        if (remaining > 0) {
            System.out.println("Remaining students are: ");
            for (int i = 0; i < remaining; i++) {
                System.out.print(students.get(index++) + " ");
            }
        }
        in.close();
    }
}
