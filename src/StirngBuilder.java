public class StirngBuilder {
    public static void main(String[] args) {
        

        StringBuilder str = new StringBuilder("Ahtasham");

        System.out.println(str);
        
        str.append(" Halim ");
        str.append(23);
        System.out.println("Append: "+str);
        
        str.reverse();
        System.out.println("Reverse: "+str);
        
        str.delete(4, 6);
        System.out.println("Delete: "+str);
    }
}
