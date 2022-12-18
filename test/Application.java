package test;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 0;
        }   catch (ArithmeticException e){
            System.out.println("на ноль делить нельзя");
        }
        System.out.println(number);
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }

    public static int divide(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException ("На ноль делить нельзя");
        }
        return a1 / a2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
