package Leetcode.easy;

import java.sql.Array;
import java.util.Arrays;

public class _66_plus_one {
    public static int[] plusOne(int[] digits) {
        int n = digits.length; // số phần tử trong mảng
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits; // return luôn
            } else  {
                digits[i] = 0; // tiếp tục for
            }
        }
        int[] newDigits = new int[n + 1]; // tạo mảng mới
        newDigits[0] = 1;
        return newDigits;
    }
    // 123 -> 124 -> th1
    // 129 -> 130 // 9 2 1 -> ptu đầu = 9 -> + 1 = 0 -> tăng cái thằng 2 -> th2
    // 99 -> 100

    public static void main(String[] args) {
        int[] digits = {1,2,9};
        System.out.println(Arrays.toString(plusOne(digits)));

    }
}

//          Input: arr = [2,4,6]
//          Output: [2,4,7]

//          Input: arr = [9,9]
//          Output: [1,0,0]

//        Explanation: The array represents the integer 246.
//        Incrementing by one gives 246 + 1 = 247.
//        Thus, the result should be [2,4,7].