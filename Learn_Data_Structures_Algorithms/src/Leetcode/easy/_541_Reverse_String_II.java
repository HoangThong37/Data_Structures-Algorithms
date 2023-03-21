package Leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class _541_Reverse_String_II {

    public static String reverseStr(String s, int k) {
        if (s == null || s.isEmpty() || k == 0) {
            return "";
        }
        int i = 0;  // bđ = 0
        StringBuilder stringBuilder = new StringBuilder(s);
        while (i < s.length()) { // nếu i < số lượng phần tử
            int left = i;
            int right = Math.min(i+k-1, s.length()-1);
            while (left < right) {
                char a = stringBuilder.charAt(left);
                char b = stringBuilder.charAt(right);
                stringBuilder.setCharAt(left, b);
                stringBuilder.setCharAt(right, a);
                left++;
                right--;
            }
            i = i + 2 * k;
        }
     return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }

}

//        Given a string s and an integer k, reverse the first k characters for every 2k
//        characters counting from the start of the string.
//
//        If there are fewer than k characters left, reverse all of them.
//        If there are less than 2k but greater than or equal to k characters,
//        then reverse the first k characters and leave the other as origin

//Input: s = "abcdefg", k = 2
//        Output: "bacdfeg"

//  a b c d e f g
//