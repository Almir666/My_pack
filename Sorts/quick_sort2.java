package Sorts;
import java.util.Arrays;

public class quick_sort2 {

    public static void quickSort(int[] arr, int minIndex, int maxIndex) {
        if (minIndex > maxIndex) {
            return;
        }
        int pivot = getPivotIndex(arr, minIndex, maxIndex);
        quickSort(arr, minIndex, pivot - 1);
        quickSort(arr, pivot + 1, maxIndex);
    }
    public static int getPivotIndex(int[] arr, int minIndex, int maxIndex) {
        int pivotIndex = maxIndex - 1;
        for(int i = minIndex; i < maxIndex - 1; i++) {
            if (arr[i] < arr[maxIndex]) {
                pivotIndex++;
                swap(arr, i, pivotIndex);
            }
        }
        pivotIndex++;
        swap(arr, pivotIndex, maxIndex);
        return pivotIndex;
    }
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 1, 8, 9, 6, 7, 9};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
