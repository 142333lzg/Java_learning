package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    // swap的另一种写法：使用异或（注意两个数的内存位置不能相同）
    // a ^ a = 0, a ^ 0 = a
//    public static void swap(int[] arr, int index1, int index2) {
//        arr[index1] = arr[index1] ^ arr[index2];
//        arr[index2] = arr[index1] ^ arr[index2];
//        arr[index1] = arr[index1] ^ arr[index2];
//    }

    public static void main(String[] args) {
        int[] myarray = {3, 6, 9, 1, 5, 6, 8, 2, 3, 4, 7};
        bubbleSort(myarray);
        System.out.println(Arrays.toString(myarray));
    }
}
