package Leetcode.programming.sliding_window;

public class _485_Max_Consecutive_Ones {


    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(maxConsecutive(nums));
    }

//    private static int maxConsecutive(int[] nums) {
//        int n = nums.length;
//        int count = 1;
//        int max = 0;
//
//        for (int i = 0; i < n-1; i++) {
//            if (nums[i] == nums[i+1]) {
//                count++;
//            } else {
//                count = 1;
//            }
//            max = Math.max(max, count);
//        }
//
//        return max;
//    }

    private static int maxConsecutive(int[] nums) {
        int n = nums.length;
        int max = 0;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(nums[i]);
        }

        String[] strings = stringBuilder.toString().split("0");
        for (int i = 0; i < strings.length; i++) {
            max = Math.max(max, strings[i].length());
        }

        return max;
    }
}


// nums = [1,1,0,1,1,1]
// output = 3