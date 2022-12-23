package test.Exeption.Dz.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        F();
    }
    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Float.parseFloat(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

public static void F() {
    Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите дробное число: ");
            String key = in.next();
          
        }
    }    
}
