public class BoxVolume {
    public static void main(String[] args) {
        Box box = new Box();
        box.length = 5;
        box.width = 4;
        box.height = 3;
        double volume = box.length * box.width * box.height;
        System.out.println("The volume of the box is: " + volume);
    }
}
