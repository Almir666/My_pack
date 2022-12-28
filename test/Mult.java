package test;

public class Mult<T extends Number> {
    public int mult(T a, T b) {
        return a.shortValue() * b.shortValue();
    }
    
    public static void main(String[] args) {
        Mult<Integer> test = new Mult<>();
        System.out.println(test.mult(4, 5));
    }
}
