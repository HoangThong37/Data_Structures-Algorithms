package Leetcode.medium;

import java.util.Arrays;

public class _238 {
    // chia ra. xem với vị trí đó bên trái tăng bao nhiêu lần
    // bên phải tăng bao nhiêu lần
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        // check bên trái
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        // check bên phải
        right[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // nhóm kết quả
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]