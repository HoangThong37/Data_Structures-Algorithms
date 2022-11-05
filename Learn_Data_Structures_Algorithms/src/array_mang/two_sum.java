package array_mang;

import java.util.Arrays;
import java.util.HashMap;

public class two_sum {
//    public static int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//        int[] result = new int[2];
//        int sum =0;
//        int number1 =0;
//        for (int i = 0; i < n; i++) {
//            number1 = nums[i]; // chạy từ phần tử đầu
//            for (int j = i+1; j < n; j++) {
//                sum = number1+nums[j];
//                if (sum == target) {
//                    result[0]= i;
//                    result[1]=j;
//                }
//            }
//        }
//        return result;
//    }
public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap();
    for(int i=0; i<nums.length; i++) {
        int expectedKey = target - nums[i];
        if(map.containsKey(expectedKey)) {
            return new int[]{map.get(expectedKey), i};
        }
        map.put(nums[i], i);
    }

    throw new IllegalArgumentException("No Solution");
}
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 26)));
    }
}

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//