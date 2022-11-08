package Sorts;
import java.util.Arrays;

public class buble_sort {

    public static void bubleSort(int[] arr) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                isSorted = false;    
            }

        }
    }
    }
    public static void main(String[] args) {
        int[] array = {4, 1, 6, 7, 3, 5, 5, 9}; 
        bubleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
