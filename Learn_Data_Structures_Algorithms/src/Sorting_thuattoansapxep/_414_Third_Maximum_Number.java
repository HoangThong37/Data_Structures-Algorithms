package Sorting_thuattoansapxep;

import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int i = 0; i < nums.length; i++) {
            insert(maxArr, nums[i]);
        }
        if (maxArr[2] != Long.MIN_VALUE) {
            return (int) maxArr[2];
        }
        return (int) maxArr[0];
    }
    // 3 2 1 2 => 3 2 1

    private static void insert(long[] maxArr, int value) {
        int i = 0;
        while (i < maxArr.length) {
            if (value == maxArr[i]) {
                return;
            }
            else if (value > maxArr[i]) {
                break;
            }
            else  {
                i++;
            }
        }
        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i ; j--) {   // 1 2 3 4 5 6
                maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 9, 5};
        System.out.println(thirdMax(arr));
    }
}

//    Given an integer array nums,
//    return the third distinct maximum number in this array.
//    If the third maximum does not exist, return the maximum number.

//        Input: nums = [3,2,1]
//        Output: 1
//        Explanation:
//        The first distinct maximum is 3.
//        The second distinct maximum is 2.
//        The third distinct maximum is 1.
