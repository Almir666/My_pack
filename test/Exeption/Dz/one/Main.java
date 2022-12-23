package test.Exeption.Dz.one;

import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 1, 6, 10};
        int[] arr2 = {2, 3, 14, 6, 5, 3, 10, 4};
        System.out.println();
        ArraysSub(arr1, arr2);
    }
    public static void ArraysSub(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeErrorException(null, "Длины массивов не равны");
        }
        int[] arrRes = new int[arr1.length];
        for (int i = 0; i < arrRes.length; i++) {
            arrRes[i] = arr1[i] / arr2[i];
            System.out.print(arrRes[i] + " ");
        }
    }
}


