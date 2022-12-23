package DZ_OOP.Calc;

public class Mult_model<T extends Number> extends Calc_model<T>{
    @Override
    public void setX(T value) {
        super.x = value;
    }
    @Override
    public void setY(T value) {
        super.y = value;
    }
    @Override
    public T result() {
        return x * y;
    }
}
