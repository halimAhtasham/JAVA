public class StirngBuffer {
    public static void main(String[] args) {


        StringBuffer newBuffer = new StringBuffer("Ahtasham Halim Rifat ");
        System.out.println(newBuffer);
        
        
        // Append Method
        newBuffer.append(25);
        System.out.println("1.Append Method: "+newBuffer);
        
        // Reverse Method
        newBuffer.reverse();
        System.out.println("2.Reverse Method: "+newBuffer);
        
        newBuffer = new StringBuffer("Ahtasham Halim Rifat ");
        

        // Delete Method
        newBuffer.delete(0, 6);
        System.out.println("3.Delete Method: "+newBuffer);

        // setLength Method
        newBuffer.setLength(5);
        System.out.println("4.Set Length Method: "+newBuffer);

        // We can pass a string value in StringBuffer

        String newSt = "Ahtasham";
        StringBuffer newB = new StringBuffer(newSt);
        System.out.println("String Pass: "+newB);
    }
}
