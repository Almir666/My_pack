package DZ_OOP.R_Calc;

public class R_div_model extends Calc_model{
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
        double result = -1.1;
        try {
            result = x / y;
        } catch(ArithmeticException e){
            System.out.println("на ноль делить нельзя");
        }
        return result;
    }
}

