package Leetcode.programming.two_pointers;

public class _977_Squares_of_a_Sorted_Array {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        int[] res = new int[n];

        while (0 <= index) {
            int L = nums[left] * nums[left];
            int R = nums[right] * nums[right];
            if (L > R) {
                res[index] = L;
                left++;
            } else {
                res[index] = R;
                right--;
            }
            index--;
        }

        return res;
    }

//    public static int[] sortedSquares(int[] nums) {
//        int n = nums.length;
//        if (n == 0) return new int[]{};
//
//        for (int i = 0; i < n; i++) {
//            int element = (int) Math.pow(nums[i], 2);
//            nums[i] = element;
//        }
//        Arrays.sort(nums);
//
//        return nums;
//    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
}


// Example 1:
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
//
// Example 2:
//        Input: nums = [-7,-3,2,3,11]
//        Output: [4,9,9,49,121]