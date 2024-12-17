public class InterFace {
    public static void main(String[] args) {
        Circle c = new Circle(3.75);
        c.display();
        Cylinder C = new Cylinder(2.98);
        C.display();
    }
}

interface Figure{
    double pi = 3.1416;
    double area();
}

class Circle implements Figure {
    double r;
    Circle(double q){
        r = q;
    }
        public double area(){
            double ar = pi * r * r;
            return ar;
        }
        public void display(){
            System.out.println("Area: "+ area());
        }
}

class Cylinder implements Figure{
    double r;
    Cylinder(double w){
        r = w;
    }
    public double area(){
        return ((4.0/3) * pi * (r * r * r));
    }
    public void display(){
        System.out.println("Area: "+ area());
    }
}