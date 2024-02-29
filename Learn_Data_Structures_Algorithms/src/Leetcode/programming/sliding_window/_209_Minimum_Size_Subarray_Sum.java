package Leetcode.programming.sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _209_Minimum_Size_Subarray_Sum {

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minimumSize(nums, target));
    }

    private static int minimumSize(int[] nums, int target) {
        int n = nums.length;
        int sum = 0, L = 0;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            while (sum >= target) {
                minimum = Math.min(minimum, i - L + 1);
                sum -= nums[L];
                L++;
            }
        }


        return minimum == Integer.MAX_VALUE ? 0 : minimum;
    }
}


//        Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
//        whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//
//        Example 1:
//
//        Input: target = 7, nums = [2,3,1,2,4,3]
//        Output: 2
//        Explanation: The subarray [4,3] has the minimal length under the problem constraint.

// tổng nhỏ nhất của nó >= 7.
// 2,3,1,2 > 7 (=4)

// lấy ra hết các tập   - 1,2,2,3,3,4 => sắp xếp, cộng 2 số phía sau >