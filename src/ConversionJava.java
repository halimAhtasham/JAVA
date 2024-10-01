public class ConversionJava {
    public static void main(String[] args) {
        


        // Integer to String
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("1.Integer to String: "+s);

        // Double to String
        double d = 120.345;
        String str = Double.toString(d);
        System.out.println("2.Double to String: "+str);

        String full = s.concat(str);
        System.out.println("Full: "+full);

        // Boolean to String
        boolean b = true;
        String bStr = Boolean.toString(b);
        System.out.println("3.Boolean to String: "+bStr);

        // String to Integer
        String st = "1234";
        int newInt = Integer.parseInt(st);
        System.out.println("4.String to Integer: "+newInt);

        // String to Double
        String newStr ="123.432";
        double newDouble = Double.parseDouble(newStr);
        System.out.println("5.String to Double: "+newDouble);
    }
}
