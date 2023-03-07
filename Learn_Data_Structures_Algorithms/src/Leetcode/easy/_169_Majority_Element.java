package Leetcode.easy;

public class _169_Majority_Element {
/*    public static int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }*/

     public static int majorityElement(int[] nums) {
         if (nums == null || nums.length == 0) {
             return -1;
         }
         return subMajorElement(nums, 0, nums.length-1);
    }

    private static int subMajorElement(int[] nums, int low, int heigh) {
         if (low == heigh) return nums[low]; //  trả về giá trị bên trái
         int key = low + (heigh - low)/2;
         int left = subMajorElement(nums, low, key); // đệ quy left
         int right = subMajorElement(nums, key+1, heigh);

         if (left == right) return left;

         int leftValue = countRange(nums, left, low , heigh); // check value number in left
         int rightValue = countRange(nums, right, low , heigh); // check value number in right

         return leftValue > rightValue ? left : right;
    }

    private static   int countRange(int[] nums, int value, int low, int heigh) {
         int count = 0;
        for (int i = low; i <= heigh; i++) {
            if (nums[i] == value) { // check xem có bằng không -> nếu = thì count
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }



}
//   Given an array nums of size n, return the majority element.
//   The majority element is the element that appears more than ⌊n / 2⌋ times.
//   You may assume that the majority element always exists in the array.

//Input: nums = [3,2,3]
//        Output: 3


//  đếm số lượng từng phần tử
// so sánh số lượng đo rồi return số lượng lớn nhất

//