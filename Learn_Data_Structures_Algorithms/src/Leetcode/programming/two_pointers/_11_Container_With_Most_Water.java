package Leetcode.programming.two_pointers;

public class _11_Container_With_Most_Water {

    public static void main(String[] args) {
        //int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height = {1,1};
        System.out.println(mostWater(height));
    }

    private static int mostWater(int[] height) {
        int n = height.length;
        int L = 0, R = n - 1;
        int sum = 0;
        int dt = 0;

        while (L < R) {

            dt = Math.min(height[L], height[R]) * (R-L);
            sum = Math.max(sum, dt);

            if (height[L] < height[R]) {
                L++;
            } else {
                R--;
            }
        }

        return sum;
    }
}

//    Input: height = [1,8,6,2,5,4,8,3,7]
//    Output: 49
//    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
//    In this case, the max area of water (blue section) the container can contain is 49.