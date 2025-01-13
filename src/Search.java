import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int [] a =new int[10];
        try{
            
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            in.close();
            int searchKey = 66;
            int j, flag = 0, position = 0;
            for (j = 0; j < a.length; j++) {
                if (a[j] == searchKey) {
                    position = j;
                    flag++;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Search key not found!");
            }
            else{
                System.out.println("Search key found at index number: " + position);
            }
            
        }
        catch (Exception e) {
            System.out.println("Invalid input!!");
        }
    }
}