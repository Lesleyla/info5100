package others.FinalList.ContinuousSubarraySum;
import java.util.Map;
import java.util.HashMap;

//leetcode 523
public class Main {
    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }

    private static boolean checkSubarraySum(int[] nums, int k) {
//        int tempSum = 0;
//        for (int i = 0; i < nums.length; i ++) {
//            tempSum = tempSum + nums[i];
//            int subArraySum = tempSum;
//            for (int j = 0; j < i ; j ++) {
//                if (subArraySum % k == 0) {
//                    return true;
//                }
//                subArraySum = subArraySum - nums[j];
//            }
//        }
//        return false;  time limit exceeded!!!

        // maintain a hash map to store <sum % k, index>
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            sum = sum % k;
            //case1
            if (sum == 0 && i > 0) {
                return true;
            }
            //case2
            if (map.containsKey(sum) && i - map.get(sum) > 1) {
                return true;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return false;
    }
}
