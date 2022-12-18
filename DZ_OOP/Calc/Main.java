package DZ_OOP.Calc;

public class Main {
    public static void main(String[] args) {
        Presenter sum = new Presenter(new Sum_model(), new View());
        Presenter sub = new Presenter(new Sub_model(), new View());
        Presenter mult = new Presenter(new Mult_model(), new View());
        Presenter div = new Presenter(new Div_model(), new View());

        App s = new App(sum, sub, mult, div);

        s.start(sum, sub, mult, div);
    }
}
