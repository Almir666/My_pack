package DZ_OOP.R_Calc;

public class R_sum_model extends Calc_model {

    @Override
    public double result() {
        return x + y;
    }
    @Override
    public void setX(double value) {
        super.x = value;
    }
    @Override
    public void setY(double value) {
        super.y = value;
    }
}
