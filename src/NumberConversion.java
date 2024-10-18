public class NumberConversion {
    public static void main(String[] args) {
        // Binary to Decimal
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal: "+decimal);


        // Octal to Decimal
        String octal = "765";
        Integer nDecimal = Integer.parseInt(octal, 8);
        System.out.println("Octal to Decimal: "+nDecimal);


        // Hexadecimal to Decimal
        String hexaDecimal = "DADA";
        Integer newDecimal = Integer.parseInt(hexaDecimal, 16);
        System.out.println("hexaDecimal to Decimal: "+newDecimal);

        // Decimal to Binary
        decimal = 10;
        binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal to Binary: "+binary);

        // Decimal to Octal
        decimal = 45692;
        octal = Integer.toOctalString(decimal);
        System.out.println("Decimal to Octal: "+octal);

        // Decimal to Hexadecimal
        decimal = 10986;
        hexaDecimal = Integer.toHexString(decimal);
        System.out.println("Decimal to hexaDecimal: "+hexaDecimal);
    }
}
