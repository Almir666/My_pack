package Dz_OOP.Task_3.Array_sort;

public class Arr implements Sorted{
    private int[] arr;

    public Arr(int[] arr) {
        this.arr = arr;
    }

    private void sortLastNum(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] % 10 < arr[i - 1] % 10) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    @Override
    public void arrSorted() {
        sortLastNum(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
