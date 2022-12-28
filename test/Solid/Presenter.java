package test.Solid;

public class Presenter {
    Operator op;
    View view;

    public Presenter(Operator o, View v) {
        op = o;
        view = v;
    }

    public void getOperation() {
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        
    }
}
