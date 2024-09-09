
package sub.cse;

import java.util.Scanner;

import www.sub.Calculator;

public class myProgram {

    
    public static void main(String[] args) {
       
       Scanner s = new Scanner(System.in);
       Calculator c = new Calculator();
       System.out.println("Enter two value");
       c.a = s.nextDouble();
       c.b = s.nextDouble();
       double x = c.divi();
       System.out.println(x);
       
    } 
}
