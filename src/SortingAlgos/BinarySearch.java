package SortingAlgos;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int begin = 0;
        int end = nums.length-1;
        int mid = 0;

        while (begin < end) {
            mid = (begin+end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                begin = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
