package Leetcode.programming.two_pointers;


import java.util.Arrays;

public class _16_3Sum_closest {

//    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 0};
//        int target = -100;
//
//        int res = 0;
//        int max =Integer.MAX_VALUE;
//        System.out.println(sumClosest(nums, target));
//    }


    int res = 0;
    int max = Integer.MAX_VALUE;

    public int sumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            if ((i == 0) || nums[i] == nums[i + 1]) {
                Solve(nums, i, i + 1, target);
            }
        }

        return res;
    }

    private void Solve(int[] nums, int i, int i1, int target) {
        int n = nums.length;
        int L = i1;
        int R = n - 1;

        while (L < R) {
            int val = nums[i] + nums[L] + nums[R];
            if (Math.abs(target - val) < max) {
                res = val;
                max = Math.abs(target - val);
            } else if (val < target) {
                L++;
            } else {
                R--;
            }
        }
    }
}

//  Tìm tổng gần nhất với mục tiêu
//  Input: nums = [-1,2,1,-4], target = 1
//         Output: 2
//         Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

//class Solution {
//
//    private  int res = 0;
//    private int max = Integer.MAX_VALUE;
//
//    private void Solve(int[] nums, int x, int i, int T) {
//        int n = nums.length;
//        int L = i;
//        int R = n - 1;
//        while (L<R) {
//            int val = (nums[x] + nums[L] + nums[R]);
//            if (Math.abs(T-val) < max) {
//                res = val;
//                max = Math.abs(T - val);
//            } else if (val > T) {
//                R--;
//            } else {
//                L++;
//            }
//        }
//    }
//
//    public int threeSumClosest(int[] nums, int target) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        for (int i = 0; i < n-2; i++) {
//            if (i == 0 || nums[i-1] != nums[i]) {
//                Solve(nums, i, i + 1, target);
//            }
//        }
//
//        return res;
//    }
//}