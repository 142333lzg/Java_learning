package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        //对于arr中的某一段left-right，以第一个元素为基准，确定其在数组中的位置，返回
        int p = partition(arr, left, right);
        quickSort(arr, left, p - 1);
        quickSort(arr, p + 1, right);

    }

    public static int partition(int[] arr, int left, int right) {
        int pival = arr[left];
        int pival_index = left;

        while (left < right) {
            if (arr[right] >= pival) {
                right--;
            } else {
                swap(arr, ++left, right);
            }
        }
        swap(arr, left, pival_index);
        pival_index = left;
        return pival_index;
    }

//    public static void quickSort(int[] arr, int left, int right) {
//        if (left >= right) return;
//
//        int random_index = left + (int) (Math.random() * (right - left + 1));
//        swap(arr, random_index, right);
//        //
//        int[] p = partition(arr, left, right);
//        quickSort(arr, left, p[0]);
//        quickSort(arr, p[1], right);
//
//    }
//
//    //输入数组、左边界和右边界，返回长度为2的数组
//    public static int[] partition(int[] arr, int left, int right) {
//        int less = left - 1;
//        int more = right;
//        int pival = arr[right];
//
//        while (left < more) {
//            if (arr[left] < pival) {
//                swap(arr, ++less, left++);
//            } else if (arr[left] > pival) {
//                swap(arr, --more, left);
//            } else left++;
//        }
//        swap(arr, left, right);
//
//        return new int[]{less, more};
//    }
//

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index2] = arr[index1];
        arr[index1] = tmp;
    }

    public static void main(String[] args) {
        int[] myarray = {4, 7, 1, 8, 6, 5, 2, 3, 9};
        quickSort(myarray, 0, myarray.length - 1);
        System.out.println(Arrays.toString(myarray));
    }
}
