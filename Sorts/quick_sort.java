package Sorts;
import java.util.Arrays;

public class quick_sort {
    public static void quickSort(int[] arr, int low, int high) {
        if (arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int opora = arr[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }
            while (arr[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 4, 1, 8, 9, 6, 7};
        System.out.println(Arrays.toString(array));
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
    }
}
