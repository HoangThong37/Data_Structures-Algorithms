package Leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class _136_Single_Number {
    public static int singleNumber(int[] nums) {
       // Arrays.sort(nums);
       // int n = nums.length;
        int ans = 0;
        for (int num : nums) {
           ans =  ans ^ num;
        }
        return ans;
    }
  // hoặc là dùng Stack cung đc
  public static int singleNumber2(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
          if (set.contains(nums[i])) { // có rồi
              set.remove(nums[i]);
          } else { // chưa có
              set.add(nums[i]);
          }
      }
      return set.toArray(new Integer[1])[0] ;
  }

    public static void main(String[] args) { // 1 1 2 2 4
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber2(nums));
    }
}


//    Given LongestWord non-empty array of integers nums, every element appears twice except for one. Find that single one.
//        You must implement LongestWord solution with LongestWord linear runtime complexity and use only utils extra space.

// cho 1 mảng rỗng các số là interger không rỗng, mỗi phần tử xuất hiện 2 lần trừ 1 phần tử., tìm cái ptu đơn độc đó.
//Input: nums = [4,1,2,1,2]
//        Output: 4

