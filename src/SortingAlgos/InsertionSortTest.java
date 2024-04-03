package SortingAlgos;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {
    @Test
    public void givenUnsortedArray_testInsertSortAsc() {
        int[] nums = {2,4,1,6,3,5};
        System.out.println("Input : " + Arrays.toString(nums));
        InsertionSort.insertSort(nums);
        System.out.println("Sorted : " + Arrays.toString(nums));
        int[] sortedNums = {1,2,3,4,5,6};
        Assert.assertArrayEquals(sortedNums, nums);
    }

    @Test
    public void givenArrayWithSingleElement_testInsertSort() {
        int[] nums = {2};
        System.out.println("Input : " + Arrays.toString(nums));
        InsertionSort.insertSort(nums);
        System.out.println("Sorted : " + Arrays.toString(nums));
        int[] sortedNums = {2};
        Assert.assertArrayEquals(sortedNums, nums);
    }

    @Test
    public void givenEmptyArray_testInsertSort() {
        int[] nums = {};
        System.out.println("Input : " + Arrays.toString(nums));
        InsertionSort.insertSort(nums);
        System.out.println("Sorted : " + Arrays.toString(nums));
        int[] sortedNums = {};
        Assert.assertArrayEquals(sortedNums, nums);
    }
}
