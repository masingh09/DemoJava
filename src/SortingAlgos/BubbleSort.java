package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        int length = arr.length;
        for(int j=0; j<length; j++) {
            for (int i=1; i<length; i++) {
                 if (arr[i] < arr[i-1]) {
                    arr[i] = arr[i] + arr[i-1];
                    arr[i-1] = arr[i] - arr[i-1];
                    arr[i] = arr[i] - arr[i-1];
                }
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
