package test;

import java.util.HashMap;
import java.util.Map;

public class _1_two_sum {

/*  Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

      // solution 2.
//    public static int[] twoSum(int[] nums, int target) {
//        // dùng hash map - key / value
//        if (nums.length == 0) {
//            return new int[0];
//        }
//        if (nums == null) {
//            return null;
//        }
//        Map<Integer, Integer> result = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int temp = target - nums[i];
//
//            if (result.containsKey(temp)) {
//                return new int[]{result.get(temp), i};
//            }
//            result.put(nums[i], i);
//        }
//        return null;
//    }
    // 2 7 11 15 - 9
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    result[0] = map.get(complement);
                    result[1] = i;
                    return result;
                }
                map.put(nums[i], i);
            }
            return result;
        }


    public static void main(String[] args) {
       int nums[] = {2,7,11,15};
       int target = 9;
        twoSum(nums, target);
       //System.out.println(twoSum(nums, target));
    }

//    Solution 1.
//    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target)  {
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;
//    }
}
