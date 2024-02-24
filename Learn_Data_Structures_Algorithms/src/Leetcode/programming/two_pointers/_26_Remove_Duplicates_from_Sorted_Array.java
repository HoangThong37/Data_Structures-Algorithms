package Leetcode.programming.two_pointers;

public class _26_Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {
        int[] nums = {1,1,12};
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate(nums));
    }

    private static int removeDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        while (j < n) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i+1;
    }
}


// Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).


//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//        Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).