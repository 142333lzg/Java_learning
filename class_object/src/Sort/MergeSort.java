package Sort;

import java.util.Arrays;

public class MergeSort {
    static void mergeSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        //
        int left = 0, right = arr.length - 1;
        process(arr, left, right);
    }

    //process函数得到一个排好序的数组：合并两个子数组
    static void process(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + ((right - left) >> 1);
        process(arr, left, mid);
        process(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // 创建临时数组用于合并
        int leftpointer = left;
        int rightpointer = mid + 1;
        int pointer = 0;

        while (leftpointer <= mid && rightpointer <= right) {
            if (arr[leftpointer] <= arr[rightpointer]) {
                temp[pointer++] = arr[leftpointer++];
            } else {
                temp[pointer++] = arr[rightpointer++];
            }
        }
        while (leftpointer <= mid) {
            temp[pointer++] = arr[leftpointer++];
        }
        while (rightpointer <= right) {
            temp[pointer++] = arr[rightpointer++];
        }

        // 将临时数组的内容复制回原数组的相应部分
        for (int i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }

    //不能在原始数组上修改，因为右侧的数据会覆盖左侧数据，再次便利左侧数据时，与原始数据出现差别
/*    static void merge(int[] arr, int left, int mid, int right) {
        int leftpointer = left;
        int rightpointer = mid + 1;
        int pointer = left;

        while (leftpointer <= mid && rightpointer <= right) {
            if (arr[leftpointer] <= arr[rightpointer]) {
                arr[pointer++] = arr[leftpointer++];
            } else {
                arr[pointer++] = arr[rightpointer++];
            }
        }
        while (leftpointer <= mid) {
            arr[pointer++] = arr[leftpointer++];
        }
        while (rightpointer <= right) {
            arr[pointer++] = arr[rightpointer++];
        }
    }*/

    public static void main(String[] args) {
        int[] myarray = {4, 7, 1, 8, 6, 5, 2, 3, 9};
        mergeSort(myarray);
        System.out.println(Arrays.toString(myarray));
    }
}
