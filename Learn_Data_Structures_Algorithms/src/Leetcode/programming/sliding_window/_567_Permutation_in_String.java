package Leetcode.programming.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _567_Permutation_in_String {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bbbca";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> charMap1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            charMap1.put(c, charMap1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> charMap2 = new HashMap<>();
        int L = 0, R = 0, count = 0;

        while (R < s2.length()) {
            charMap2.put(s2.charAt(R), charMap2.getOrDefault(s2.charAt(R), 0) + 1);
            R++;
            count++;

            while (count >= s1.length()) {
                if (charMap1.equals(charMap2)) return true;

                charMap2.put(s2.charAt(L), charMap2.getOrDefault(s2.charAt(L), 0) - 1);
                if (charMap2.get(s2.charAt(L)) == 0) {
                    charMap2.remove(s2.charAt(L));
                }
                L++;
                count--;
            }
        }
        return false;
    }

//    public static boolean checkInclusion(String s1, String s2) {
//        char[] char1 = s1.toCharArray();
//        char[] char2 = s2.toCharArray();
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < char2.length; i++) {
//            map.put(char2[i], map.getOrDefault(char2[i], 0) + 1);
//        }
//
//        int k = 0;
//        for (char item : char1) {
//            if (map.containsKey(item)) {
//                k++;
//            }
//        }
//
//        return char1.length == k ? true : false;
//    }
}

//    Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
//    In other words, return true if one of s1's permutations is the substring of s2.


/*
        Example 1:
        Input: s1 = "ab", s2 = "eidbaooo"
        Output: true
        Explanation: s2 contains one permutation of s1 ("ba").

        Example 2:
        Input: s1 = "ab", s2 = "eidboaoo"
        Output: false

*/

// hoán vị của nhau
// a b -> b a
// fori ->
//