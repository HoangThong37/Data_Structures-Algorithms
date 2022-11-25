package Leetcode.easy;


public class _2042_Check_if_Numbers_Are_Ascending {
   // b1. tác chuỗi dựa trên cái khỏang trắng
    //b2. check xem phải là ki tự số hay k
    // b3. pas sang kiểu int vì đag kiểu char
    // b4.
    public static boolean areNumbersAscending(String s) {
        int check = 0;
        for(String word : s.split(" ")) {
            if (Character.isDigit(word.charAt(0))) {
                int numberInt = Integer.parseInt(word);
                if (numberInt <= 0) {
                    return false;
                } else  {
                    check = numberInt;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
        //System.out.println(areNumbersAscending(s));
    }
}
// Kiểm tra xem các số có tăng dần trong câu không

//Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
//        Output: true
//        Explanation: The numbers in s are: 1, 3, 4, 6, 12.
//        They are strictly increasing from left to right: 1 < 3 < 4 < 6 < 12.


//   isLetter(): Kiểm tra ký tự char có phải là một ký tự trong khoảng a-zA-Z hay không.
//   isDigit(): Kiểm tra một ký tự có phải là một ký tự số hay không.
//    isUpperCase(): Trả về true nếu ký tự nằm trong khoảng A-Z.
//    isLowerCase(): Trả về true nếu ký tự nằm trong khoảng a-z.
//    charAt() :  trả về giá trị Char của chuỗi tại vị trí có chỉ số index được chỉ định
//    split() tách chuỗi này theo biểu thức chính quy và trả về mảng chuỗi.
//
// https://walkccc.me/LeetCode/problems/2042/