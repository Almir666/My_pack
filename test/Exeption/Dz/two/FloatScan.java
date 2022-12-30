package test.Exeption.Dz.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatScan {
    Scanner in;

    public void FloatView() {
        while (true) {
            in = new Scanner(System.in);
            try {
                System.out.println("Введите дробное число: ");
                System.out.println("Ваше число: " + in.nextFloat());
                return;
            } catch (InputMismatchException e) {
                System.out.println("Вам нужно ввести дробное число");
            }
        }
    }
}
