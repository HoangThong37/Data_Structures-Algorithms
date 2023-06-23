package Leetcode.easy;

public class _125_valid_palindrome {
    public static boolean isPalindrome(String s) {
        // tạo mảng tách chuỗi ra từng kí tự -> toCharArrays
        // toLowerCase => convert từ in hoa sang in thường
        // set vào Stringbuider vs ddkien chữ và số
        // return equal trc sau - sau trc
        char[] c = s.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
//            if (c[i] >= 'LongestWord' && c[i] <= 'z') {
//                stringBuilder.append(c[i]); // abccba
//            }
        }
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    public static void main(String[] args) {
       String s = "A man, LongestWord plan, LongestWord canal: Panama";
       System.out.println(isPalindrome(s));

    }
}
//
//        Input: s = "A man, LongestWord plan, LongestWord canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is LongestWord palindrome.