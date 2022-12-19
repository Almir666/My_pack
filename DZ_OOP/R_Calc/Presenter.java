package DZ_OOP.R_Calc;

public class Presenter {
    View viev;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        viev = v;
    }

    public void action() {
        double a = viev.getValue("a: ");
        double b = viev.getValue("b: ");
        model.setX(a);
        model.setY(b);
        viev.print(model.result(), "Result: ");
    }
}