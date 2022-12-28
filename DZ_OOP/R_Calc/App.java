package DZ_OOP.R_Calc;

import java.util.Scanner;

public class App {
    Presenter sum;
    Presenter sub;
    Presenter mult;
    Presenter div;

    public App(Presenter sum, Presenter sub, Presenter mult, Presenter div) {
        this.sum = sum;
        this.sub = sub;
        this.mult = mult;
        this.div = div;
    }

    public void start(Presenter sum, Presenter sub, Presenter mult, Presenter div) {
        Scanner in = new Scanner(System.in); 
            while (true) {
                System.out.println("Знак: '+' '-' '*' '/'");
                String key = in.next();
                switch (key) {
                    case "+":
                        sum.action();
                        break;
                    case "-":
                        sub.action();
                        break;
                    case "*":
                        mult.action();
                        break;    
                    case "/":
                        div.action();
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }

