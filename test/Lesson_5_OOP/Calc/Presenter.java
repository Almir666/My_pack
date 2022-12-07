package test.Lesson_5_OOP.Calc;

import java.util.Scanner;

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

    public void start(Presenter sum, Presenter sub, Presenter mult, Presenter div) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println(" 1: '+'  2: '-' 3: '*' 4: '/'");
                String key = in.next();
                switch (key) {
                    case "1":
                        sum.action();
                        break;
                    case "2":
                        sub.action();
                        break;
                    case "3":
                        mult.action();
                        break;    
                    case "4":
                        div.action();
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
}