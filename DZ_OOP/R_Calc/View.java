package DZ_OOP.R_Calc;

import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return input.nextDouble();
    }

    public void print(double num, String title) {
        System.out.printf("%s%f\n", title, num);
    }
}
