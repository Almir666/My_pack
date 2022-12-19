package DZ_OOP.R_Calc;

public class Main {
    public static void main(String[] args) {
        Presenter sum = new Presenter(new R_sum_model(), new View());
        Presenter sub = new Presenter(new R_sub_model(), new View());
        Presenter mult = new Presenter(new R_mult_model(), new View());
        Presenter div = new Presenter(new R_div_model(), new View());

        App s = new App(sum, sub, mult, div);

        s.start(sum, sub, mult, div);
    }
}
