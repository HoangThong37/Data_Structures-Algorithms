package Leetcode.programming.two_pointers;

import java.util.Set;

public class _80_Remove_Duplicates_from_Sorted_Array_II {


    public static void main(String[] args) {
        //int[] nums = {1,1,1,2,2,3};
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicate(nums));
    }

    private static int removeDuplicate(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n;
        int count = 0;
        int L = 0;
        int R = 1;
        while (R < n) {
            if (nums[L] != nums[R]) {
                L++;
                nums[L] = nums[R];
                count = 0;
            } else if (nums[L] == nums[R] && count < 2) {
                count++;
                nums[L++] = nums[R];
            }
            R++;
        }

        return L;
    }

//    private static int removeDuplicate(int[] nums) {
//        if (nums.length == 0) return 0;
//        int k = 1;
//        int count = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i-1]) {
//                count++;
//                if (count <= 2) {
//                    nums[k] = nums[i];
//                    k++;
//                }
//            } else {
//                count = 1;
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//        return k;
//    }
}

// Example 1:
//        Input: nums = [1,1,1,2,2,3]
//        Output: 5, nums = [1,1,2,2,3,_]
//        Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).
//
// Example 2:
//        Input: nums = [0,0,1,1,1,1,2,3,3]
//        Output: 7, nums = [0,0,1,1,2,3,3,_,_]
//        Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).