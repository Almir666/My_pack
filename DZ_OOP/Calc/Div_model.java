package DZ_OOP.Calc;

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
        int result = -1;
        try {
            result = x / y;
        } catch(ArithmeticException e){
            System.out.println("на ноль делить нельзя");
        }
        return result;
    }
}

