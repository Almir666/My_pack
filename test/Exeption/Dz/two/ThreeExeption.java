package test.Exeption.Dz.two;

public class ThreeExeption {
    int a = 90;
    int b = 3;
    int[] abc;

    public void secondTask() {
        try {
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя!");
        } catch (RuntimeException ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    private void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
