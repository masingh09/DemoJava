package SortingAlgos;

public class MergeSort {

    public static void sort(int[] nums, int length) {
        if (length < 2) {
            return;
        }

        //divide
        //1. find the mid
        int mid = length/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[length - mid];

        //2. split array into left and right
        for (int i=0; i<mid; i++) {
            leftArr[i] = nums[i];
        }

        for(int i=mid; i< length; i++) {
            rightArr[i-mid] = nums[i];
        }

        sort(leftArr,mid);
        sort(rightArr, length-mid);

        //conquer
        mergeSplitArrays(nums, leftArr, rightArr, mid, length-mid);
    }

    private static void mergeSplitArrays(int[] nums, int[] leftArr, int[] rightArr, int leftLen, int rightLen) {
        int l = 0;
        int r = 0;
        int i = 0;

        while(l<leftLen && r<rightLen) {
            if (leftArr[l] <= rightArr[r]) {
                nums[i++] = leftArr[l++];
            } else {
                nums[i++] = rightArr[r++];
            }
        }

        while(l < leftLen) {
            nums[i++] = leftArr[l++];
        }

        while(r < rightLen) {
            nums[i++] = rightArr[r++];
        }
    }
}
