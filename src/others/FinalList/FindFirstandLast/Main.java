package others.FinalList.FindFirstandLast;

import java.util.Arrays;
//leetcode34
public class Main {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] results = searchRange(nums, target);
        System.out.println(Arrays.toString(results));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 }; //initialize the result
        int i = 0;
        int j = nums.length - 1;

        while(i <= j){ //find where the target is
            int mid = (i + j) / 2;
            if(nums[mid] == target){
                result[0] = mid;
            }
            if(nums[mid] >= target){
                //不写>=有问题,会直接跑else里的部分.注意if else的逻辑关系
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        //reset the i and j. find the right edge
        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
            }
            if (nums[mid] > target){
                j = mid - 1;
            } else {//nums[mid] <= target
                i = mid + 1;
            }
        }
        return result;

    }
}
