
package sub.cse;
import java.util.Scanner;
import www.myclass.Calc;
public class myprogram {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Calc c = new Calc();
        
//        c.n = 15;
//        c.r = 5;
         System.out.print("Enter value for n: ");
        c.n = input.nextInt();
        
        System.out.print("Enter value for r: ");
        c.r = input.nextInt();
        
        
        long outputnCr = c.ncr();
        long outputnPr = c.npr();
        long outputfact = c.fact(12);
        System.out.println("NCR = "+outputnCr);
        System.out.println("NPR = "+outputnPr);
        System.out.println("Factorial = "+outputfact);
      
    } // end of main method
    
} // end of main class
