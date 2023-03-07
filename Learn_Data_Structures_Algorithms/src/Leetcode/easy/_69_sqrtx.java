package Leetcode.easy;

public class _69_sqrtx {

    public static int mySqrt(int x) {
        // căn 9 = 3 -> 3 . 3 = 9
        // căn 16 = 4 -> 4 . 4 = 16
        if (x <= 0) return 0;

        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                start = mid - 1;
            } else {
                end = mid + 1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
       // System.out.println("helo");
    }
}


//        Input: x = 4
//        Output: 2
//        Explanation: The square root of 4 is 2, so we return 2.