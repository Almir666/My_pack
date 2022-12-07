package test.Lesson_5_OOP.Calc;

import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return input.nextInt();
    }

    public void print(int num, String title) {
        System.out.printf("%s%d\n", title, num);
    }
}
