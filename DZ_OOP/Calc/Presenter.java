package DZ_OOP.Calc;

public class Presenter {
    View viev;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        viev = v;
    }

    public void action() {
        int a = viev.getValue("a: ");
        int b = viev.getValue("b: ");
        model.setX(a);
        model.setY(b);
        viev.print(model.result(), "Result: ");
    }
}