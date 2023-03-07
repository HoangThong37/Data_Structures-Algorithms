package Leetcode.easy;

public class _27_Remove_Element {
    //    public static int removeElement(int[] nums, int val) {
//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//        return k;
//    }
    public static int removeElement(int[] nums, int val) {
        int num = nums.length;
        for (int i = 0; i < num; ) {
            if (nums[i] == val) {
                // xóa
                for (int j = i; j <= num -2; j++) {
                    nums[j] = nums[j+1];
                }
                num--;
            } else {
                i++;
            }
        }
        return num;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 3, 5};
        System.out.println(removeElement(nums, 2));
    }
}

//Input:  nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//        It does not matter what you leave beyond the returned k (hence they are underscores).