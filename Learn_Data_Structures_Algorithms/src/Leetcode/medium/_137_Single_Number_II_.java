package Leetcode.medium;

public class _137_Single_Number_II_ {
    public static int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;

        for (int num : nums) {
            ones ^= (num & ~twos);
            twos ^= (num & ~ones);
        }
        return ones;
    }

    public static void main(String[] args) {
        int[] num = {2,2,3,2};
        System.out.println(singleNumber(num));
    }
}
//Input: nums = [2,2,3,2]
//        Output: 3