package test.Exeption.Dz.two;

public class DivZero {
    int[] array;
    public DivZero() {
        array = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public void firstTask() {
        try {
            int d = 0;
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
