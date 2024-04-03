package SortingAlgos;

import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void givenSortedArray_BinarySearch_findsTarget() {
        int[] nums = {1,8,19,23,35,43,59,67,84,91,101};
        int target = 43;
        int index = BinarySearch.search(nums, target);
        System.out.println(target + " found at " + index);

    }
}
