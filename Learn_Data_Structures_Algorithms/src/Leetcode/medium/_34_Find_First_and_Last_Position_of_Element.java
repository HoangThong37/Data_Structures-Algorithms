package Leetcode.medium;

public class _34_Find_First_and_Last_Position_of_Element {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findStartIndex(nums, target);
        result[1] = findEndIndex(nums, target);
        return result;
    }

    private int findStartIndex(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    private int findEndIndex(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }



//        int[] result = {-1, -1};
//        int start = -1;
//        int end = -1;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                if (start == -1) {
//                    start = i;
//                }
//                end = i;
//            }
//        }
//        result[0] = start;
//        result[1] = end;
//
//        return result;
    //}



    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
       // searchRange(nums, target);
    }
}

/*
Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.
 If target is not found in the array, return [-1, -1].
 You must write an algorithm with O(log n) runtime complexity.

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/
