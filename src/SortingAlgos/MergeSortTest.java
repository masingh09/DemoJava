package SortingAlgos;

import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {
    @Test
    public void givenUnsortedArray_mergeSortInAsc() {
        int[] nums = { 5, 1, 6, 2, 3, 4 };
        System.out.println("before : " + Arrays.toString(nums));
        MergeSort.sort(nums, nums.length);
        System.out.println("after : " + Arrays.toString(nums));
    }

}
