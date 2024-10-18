public class WrapperStart {
    public static void main(String[] args) {


        // Primitive -> Object
        int x = 30; //ValueOf Method
        Integer y = Integer.valueOf(x);


        Integer z = x; // Auto Boxing

        System.out.println("Primitive to Object: "+y);
        System.out.println("Primitive to Object(Auto Boxing): "+z);


        // Object -> Primitive

        Double d = 10.25;
        double e = d;
        System.out.println("\nObject to Primitive:(Unboxing): "+e);
    }
}
