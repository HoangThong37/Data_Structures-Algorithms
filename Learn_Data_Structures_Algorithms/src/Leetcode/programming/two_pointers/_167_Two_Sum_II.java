package Leetcode.programming.two_pointers;

import java.util.*;

public class _167_Two_Sum_II {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        findNumber(numbers, target);
    }

    private static int[] findNumber(int[] numbers, int target) {
        // sử dụng hashmap
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int key1 = target - numbers[i];
            if (map.containsKey(key1)) {
                res[0] = map.get(key1);
                res[1] = i;
                return res;
            }
            map.put(numbers[i], i);
        }
        return new int[] {-1, -1};
    }

//    private static int[] findNumber(int[] numbers, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    result[0] = i+1;
//                    result[1] = j+1;
//                }
//            }
//        }
//        return result;
//    }


//    private static int[] findNumber(int[] numbers, int target) {
//        // define point
//        //Arrays.sort(numbers);
//        int L = 0;
//        int R = numbers.length - 1;
//
//        while (L < R) {
//            int result = numbers[L] + numbers[R];
//
//            if (result == target) {
//                return new int[] {L+1, R+1};
//            } else if (result > target) {
//                R--;
//            } else  {
//                L++;
//            }
//        }
//        return new int[] {-1,-1};
//    }
}

//        Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
//        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].