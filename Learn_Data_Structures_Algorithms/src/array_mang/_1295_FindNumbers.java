package array_mang;

//1295. Find Numbers with Even Number of Digits
public class _1295_FindNumbers {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // ktra số chữ số
            int check = checkNumber(nums[i]);
            if (check % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    private static int checkNumber(int num) {
        int count = 0;
        int result = num;
        while (result != 0) {
            result = num / 10;
            num = result;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] number = {1,2,33,44,555,6666,77777};
        System.out.println(findNumbers(number));
//        System.out.println(checkNumber(2));
//        System.out.println(checkNumber(33));
    }
}
//Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore only 12 and 7896 contain an even number of digits.

//1. duyệt mảng
//2. kiểm tra số lượng chữ số