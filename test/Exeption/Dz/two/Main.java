package test.Exeption.Dz.two;

public class Main {
    public static void main(String[] args) {
        FloatScan f = new FloatScan();
        f.FloatView();

        DivZero d = new DivZero();
        d.firstTask();

        ThreeExeption t = new ThreeExeption();
        t.secondTask();

        CheckInputUser checkInputUser = new CheckInputUser();
        checkInputUser.checkInputUser();
    }
}
