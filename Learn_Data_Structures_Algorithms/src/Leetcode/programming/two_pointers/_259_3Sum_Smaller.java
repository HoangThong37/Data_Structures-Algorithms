package Leetcode.programming.two_pointers;

public class _259_3Sum_Smaller {


    public static void main(String[] args) {
        int[] n = {-2,0,1,3};
        int target = 2;
        System.out.println(sumSmaller(n, target));
    }

    private static int sumSmaller(int[] nums, int target) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int j = i+1;
            int k = n-1;

            while (j < k) {
                if (nums[i] + nums[j] + nums[k] < target) {
                    count++;
                    k--;
                } else {
                    j++;
                }
            }
        }


        return count;
    }

    // tìm mảng có 3 phần tử có giá trị sum < target.

    //
}
