package SortingAlgos;
import java.util.Arrays;


public class QuickSort {
    public static void sort(int[] nums) {
        System.out.println("Before : " + Arrays.toString(nums));
        quickSortArray(nums, 0, nums.length-1);
        System.out.println("Sorted : " + Arrays.toString(nums));
    }

    private static void quickSortArray(int[] nums, int begin, int end) {
        if (begin < end) {
            int partition = findPartition(nums, begin, end);
            quickSortArray(nums, begin, partition - 1);
            quickSortArray(nums, partition + 1, end);
        }
    }

    private static int findPartition(int[] nums, int begin, int end) {
        // chose pivot
        int pivot = nums[end];

        // do partition
        int partition = begin - 1;
        for (int leftPointer = begin; leftPointer < end; leftPointer++) {
            if (nums[leftPointer] < pivot) {
                partition++;
                swap(nums, partition, leftPointer);
            }
        }

        swap(nums, partition + 1, end);
        return partition+1;
    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
