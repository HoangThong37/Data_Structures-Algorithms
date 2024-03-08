package Leetcode.programming.sliding_window;

public class _487_Max_Consecutive_Ones_II {


    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1,0};
        System.out.println(maxConsecutive(nums));
    }

    private static int maxConsecutive(int[] nums) {
        int n = nums.length;
        int L = 0, R = 0, maxLength = 0;
        int count = 0;

        while (R < n) {
            if (nums[R] == 0) count++;
            while (count > 1) {
                if (nums[R] == 0) count--;
                L++;
            }

            maxLength = Math.max(maxLength, R - L + 1);
            R++;
        }

        return maxLength;
    }

//    private static int maxConsecutive(int[] nums) {
//        int n = nums.length;
//        int[] newArr = new int[n];
//        int fistZero = 0, max = 0, k = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (nums[i] == 0 && fistZero == 0) {
//                newArr[i] = 1;
//                fistZero++;
//            } else {
//                newArr[i] = nums[i];
//            }
//        }
//
//        for (int i = 0; i < newArr.length; i++) {
//            if (newArr[i] == 1) {
//                k++;
//                max = Math.max(max, k);
//            } else {
//                k = 0;
//            }
//        }
//
//        return max;
//    }
}


// Input: [1,0,1,1,0]
//        Output: 4
//        Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
//        After flipping, the maximum number of consecutive 1s is 4.
