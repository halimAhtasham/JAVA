public class StirngJava {
    public static void main(String[] args) {
        String s1 = "Ahtasham Halim";
        String s2 = "Ahtasham Halim";
        String s4 = "";
        System.out.println(s1+"\n"+s2);

        //Character type array
        char[] s3 = {'a', 'h', 't', 'a', 's', 'h', 'a', 'm'};
        System.out.println(s3);

        // Use of .contains / .equals / .equalsIgnoreCase
        System.out.println();
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 equals s2");
        }
        else {
            System.out.println("s1 notEqual s2");
        }

        // Contains method
        System.out.println();
        boolean con = s1.contains(s2);
        System.out.println("s1 contains s2 = "+con);

        // isEmpty method
        System.out.println();
        boolean b = s4.isEmpty();
        System.out.println("s4 is empty = "+b);

        // String concatenation method
        System.out.println();
        String firstName = "Ahtasham";
        String lastName = " Halim";
        String fullName = firstName.concat(lastName);
        System.out.println("Full name: "+fullName);
        
        // Uppercase method
        String upperName = fullName.toUpperCase();
        System.out.println("The upper case value: "+upperName);
        // Lowercase method
        String lowerName = fullName.toLowerCase();
        System.out.println("The lower case value: "+lowerName);

        // StartWith method
        System.out.println();
        boolean s = firstName.startsWith("A");
        System.out.println("First name start with A: "+s);
        boolean l = firstName.endsWith("m");
        System.out.println(l);

        // Array of a string

        String[] Arr = {"ahtasham", "halim", "rifat", "haimchar", "dhaka", "bangladesh"};
        for (String x : Arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]+" ");
        }

        // CharAt Method

        System.out.println();
        String country = "Bangladesh is my country";
        System.out.println(country);
        System.out.println("The length of this string:"+country.length());
        char ch = country.charAt(11);
        System.out.println(ch);

        // Code PointAt Method

        int value = country.codePointAt(0);// Indicates ASCII value
        System.out.println("Code Point At Method: "+value);


        // IndexOf Method

        int position = country.indexOf('d');
        System.out.println("Index of Method: "+position);

        // LastIndexOf Method
        position = country.lastIndexOf('d');
        System.out.println("Last Index of Method: "+position);

        // Trim Method

        String st1 = "         Bangladesh is my Homeland. I love my country very much        ";// remove first and last space of any string
        System.out.println("Trim Method: "+st1.trim());


        // Replace Method
        String st2 = "BaBaCBaBaCBaBaCBaBaCBaBaC";
        String st3 = st2.replace('B', 'D');
        System.out.println("Replace Method: "+st3);

        // Split Method
        String [] st4 = st2.split("C");
        System.out.print("Split Method: ");
        for (String x : st4) {
            System.out.print(x+" ");
        }
    }
}