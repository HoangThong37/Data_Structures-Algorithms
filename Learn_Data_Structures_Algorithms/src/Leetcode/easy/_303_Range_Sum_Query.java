package Leetcode.easy;

public class _303_Range_Sum_Query {
    //    int[] nums;
//    int[] sums;
    int[] prefix = null;
    public _303_Range_Sum_Query(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }


//    public static void main(String[] args) {
//        _303_Range_Sum_Query test = new _303_Range_Sum_Query();
//        int[] n = {-2, 0, 3, -5, 2, -1};
//        System.out.println(test.sumRange(0,2));
//    }
}
