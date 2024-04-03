package SortingAlgos;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {
    @Test
    public void givenIntegerArray_quickSortAsc() {
        int[] nums = new int[] {64, 34, 25, 12, 22, 11, 90, 5};
        QuickSort.sort(nums);
        //Assert.assertTrue();
    }
}