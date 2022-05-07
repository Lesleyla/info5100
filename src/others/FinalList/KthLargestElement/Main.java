package others.FinalList.KthLargestElement;

import java.util.Arrays;

//leetcode 215
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        //expected output = 4
        System.out.println(findKthLargest(nums, k));
    }

    private static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println("The sorted numArray is:");
        System.out.println(Arrays.toString(nums));
        System.out.println("The kth largest is:");
        return nums[nums.length - k];
    }
}
