public class InterFace {
    public static void main(String[] args) {
        
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
            return pi * r * r;
        }
}

class Sylinder implements Figure{
    double r;
    Sylinder(double w){
        r = w;
    }
    public double area(){
        return ((4/3) * pi * (r * r * r));
    }
}
