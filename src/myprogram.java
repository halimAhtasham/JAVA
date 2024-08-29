import javax.swing.JOptionPane;
public class myprogram {
    public static void main(String[] args) {

        double m1, m2, m3, m4, m5, avg;
        String name, msg;

        name = JOptionPane.showInputDialog("What is your name?");

        System.out.println("Enter your 5 marks: ");
        JOptionPane.showMessageDialog(null, "Enter your Five marks here.");
        m1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your first number: "));
        m2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your second number: "));
        m3 = Double.parseDouble(JOptionPane.showInputDialog("Enter your third number: "));
        m4 = Double.parseDouble(JOptionPane.showInputDialog("Enter your fourth number: "));
        m5 = Double.parseDouble(JOptionPane.showInputDialog("Enter your fifth number: "));
        avg = (m1 + m2 + m3 + m4 + m5) / 5;

        msg = "Hello " + name + "\nYour average marks is = " + avg;
        JOptionPane.showMessageDialog(null, msg);
    }
}