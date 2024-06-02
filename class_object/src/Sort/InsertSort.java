package Sort;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] arr) {
        if (arr == null){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
//            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
//                swap(arr, j, j - 1);
//            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        BubbleSort.swap(arr, index1, index2);
    }

    public static void main(String[] args) {
//        int[] myarray = {3, 6, 9, 1, 5, 6, 8, 2, 3, 4, 7};
        int[] myarray = {3};
        insertSort(myarray);
        System.out.println(Arrays.toString(myarray));
    }

}
