package Leetcode.programming.two_pointers;

public class _283_Move_Zeroes {

//    private static int[] moveZeroes(int[] nums) {
//        int[] newArrays = new int[nums.length];
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                newArrays[j] = nums[i];
//                j++;
//            }
//        }
//
//        return newArrays;
//    }


    public static void moveZeroes(int[] nums) {
        int L = 0;
        int R = 1;
        int n = nums.length;

        while (R < n) {
            if (nums[L] != 0) {
                L++;
                R++;
            } else if (nums[R] == 0) {
                R++;
            } else {
                int temp = nums[L];
                nums[L] = nums[R];
                nums[R] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println();
    }
}


//    Example 1:
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]

//   Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.