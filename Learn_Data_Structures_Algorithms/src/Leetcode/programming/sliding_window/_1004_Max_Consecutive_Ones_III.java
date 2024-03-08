package Leetcode.programming.sliding_window;

public class _1004_Max_Consecutive_Ones_III {

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maxConsecutive(nums, k));
    }

    private static int maxConsecutive(int[] nums, int k) {
        int n = nums.length;
        int L = 0, R = 0, maxLength = 0, count = 0;

        while (R < n) {
            if (nums[R] == 0) count++;

            while (count > k) {
                if (nums[L] == 0) {
                    count--;
                }
                L++;
            }

            maxLength = Math.max(maxLength, R - L + 1);
            R++;
        }

        return maxLength;
    }
}

//Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//        Output: 6
//        Explanation: [1,1,1,0,0,1,1,1,1,1,1]
//0 1 2 3 4 5 6 7 8 9 10
//1,1,1,0,0,0,1,1,1,1,0
//            !
//        !
// 5
