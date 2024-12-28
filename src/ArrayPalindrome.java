import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        in.close();
        int i, j, flag = 0;
        for(i=0, j = n-1; i <= j; i++, j-- ){
            if(a[i] != a[j]){
                flag++;
                break;
            }
        }
        
        if(flag == 0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}
