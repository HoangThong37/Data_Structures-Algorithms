package Leetcode.medium;

import java.util.Arrays;

public class _3Sum_Closest {

    private  int res = 0;
    private int max = Integer.MAX_VALUE;

    private void Solve(int[] nums, int x, int i, int T) {
        int n = nums.length;
        int L = i;
        int R = n - 1;
        while (L<R) {
            int val = (nums[x] + nums[L] + nums[R]);
            if (Math.abs(T-val) < max) {
                res = val;
                max = Math.abs(T - val);
            } else if (val > T) {
                R--;
            } else {
                L++;
            }
        }
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            if (i == 0 || nums[i-1] != nums[i]) {
                Solve(nums, i, i + 1, target);
            }
        }
        return res;
    }

}

/*
Given an integer array nums of length n and an integer target, find three integers
    in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/

// -4 -1 1 2