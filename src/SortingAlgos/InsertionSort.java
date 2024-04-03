package SortingAlgos;

public class InsertionSort {
    public static void insertSort(int[] nums) {
        if (nums.length <=1) {
            return;
        }
        int len = nums.length;
        //loop through un-sorted array
        for (int i=1; i<len; i++) {
            int curr_value = nums[i];
            int insert_index = i;

            //find insert position in the sorted array
            //for a value at index i :: values at index 0 to i-1 will be sorted
            // so length of sorted array will be 0 to i-1
            for (int j=i-1; j>=0; j--) {
                if (nums[j] > curr_value) {
                    nums[j+1] = nums[j];
                    insert_index = j;
                }
            }
            nums[insert_index] = curr_value;
        }

    }
}

