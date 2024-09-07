public class Box {
    double width, height, length;
    public Box() {
        width = 10.5;
        height = 20.5;
        length = 30.5;
    }
    double volume() {
        return width * height * length;
    }
}
