public class CalculatorProgram {

    public double a, b;

    public CalculatorProgram ()
    {
        a = 1;
        b = 1;
    }

    public double add ()
    {
        double c = a + b;
        return c;
    }
    public double sub ()
    {
        double c = a - b;
        return c;
    }
    public double mul ()
    {
        double c = a * b;
        return c;
    }
    public double div ()
    {
        double c = a / b;
        return c;
    }
}
