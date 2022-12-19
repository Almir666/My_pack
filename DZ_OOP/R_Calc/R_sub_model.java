package DZ_OOP.R_Calc;

public class R_sub_model extends Calc_model{
    @Override
    public void setX(double value) {
        super.x = value;
    }
    @Override
    public void setY(double value) {
        super.y = value;
    }
    @Override
    public double result() {
        return x - y;
    }
}
