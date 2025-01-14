public class RandomNumber {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 23;
        int range = upperBound - lowerBound + 1;
        int randomNumber;
        for (int i = 0; i < 15; i++) {
            randomNumber = (int)((Math.random() * range ) + lowerBound);
            System.out.print(randomNumber+ " ");
        }
    }
}
