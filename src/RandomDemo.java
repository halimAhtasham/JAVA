// import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        

        // Random random = new Random();

        // int randomNumber = random.nextInt(10); //0-9
        // int randomNumber = random.nextInt(10) + 1; // 0-10
        int randomNumber = (int) (Math.random()*10) + 1;
        System.out.println(randomNumber);
    }
}
