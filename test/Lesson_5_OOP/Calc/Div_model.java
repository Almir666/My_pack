package test.Lesson_5_OOP.Calc;

public class Div_model extends Calc_model{
    @Override
    public void setX(int value) {
        super.x = value;
    }
    @Override
    public void setY(int value) {
        super.y = value;
    }
    @Override
    public int result() {
        return x / y;
    }
}
