package Sort;

import java.util.Arrays;

public class SelectSort {

    public static void selectionSort(int[] arr) {
        /*
         * 传入一个int数组，将其按从小到大的顺序排序，返回空值*/
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i; //当前最小数字的下标为minIndex
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] > arr[minIndex] ? minIndex : j;
            }
            swap(arr, i, minIndex); 
        }

    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static void main(String[] args) {
        int[] myarray = {3, 6, 9, 1, 5, 6, 8, 2, 3, 4, 7};
        selectionSort(myarray);
        System.out.println(Arrays.toString(myarray));
    }
}



