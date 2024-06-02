//import java.util.Scanner;

import java.util.Arrays;

class ScannerTest{
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println(x);
        int[] arr1 = new int[]{1, 2, 3, 5, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        boolean isequal = Arrays.equals(arr1, arr2);
        System.out.println(isequal);
    }

}
