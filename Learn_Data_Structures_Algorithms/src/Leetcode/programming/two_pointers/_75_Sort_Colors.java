package Leetcode.programming.two_pointers;

public class _75_Sort_Colors {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColor(nums);
    }

    private static void sortColor(int[] nums) {
        int n = nums.length;
        int L = 0, R = n - 1, cur = 0;

        while (cur < R) {
            if (nums[cur] == 2) {
                swap(nums, cur, R);
                R--;
            } else if (nums[cur] == 1) {
                cur++;
            } else {
                swap(nums, cur, L);
                L++;
                cur++;
            }
        }
    }

    private static void swap(int[] nums, int cur, int change) {
        int t = nums[cur];
        nums[cur] = nums[change];
        nums[change] = t;
    }
}

/*
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of
    the same color are adjacent, with the colors in the order red, white, and blue.
    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    You must solve this problem without using the library's sort function.

   Example 1:
        Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]
        Example 2:

        Input: nums = [2,0,1]
        Output: [0,1,2]
*/
