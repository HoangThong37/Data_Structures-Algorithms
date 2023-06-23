package Leetcode.easy;

public class _231_Power_of_Two {
//    public static boolean isPowerOfTwo(int n) {
//        for (int i = 0; i < 10; i++) {
//            if (Math.pow(2, i) == n) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            while (n % 2 == 0) {
                //n >>= 1; // 16 -> 8 -> 4
                n = n >> 1;
            }
        }
        return n == 1;
    }
//   >>= Dịch phải toán hạng trái sang số vị trí là giá trị toán hạng phải.
 //   <<=	Dịch trái toán hạng trái sang số vị trí là giá trị toán hạng phải.

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
}

//    Given an integer n, return true if it is LongestWord power of two. Otherwise, return false.
//    An integer n is LongestWord power of two, if there exists an integer x such that n == 2 mũ x.

//Input: n = 1
//        Output: true
//        Explanation: 2 mũ 0 = 1