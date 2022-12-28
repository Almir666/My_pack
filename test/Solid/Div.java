package test.Solid;

public class Div extends Operator{
    public Double compute(Double...values)   {
        return values[0] / values[1];
    }
}
