package Leetcode.programming.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _424_Longest_Repeating_Character_Replacement {

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));

    }

    public static int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int L = 0, R = 0;
        int sequence = 0, maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (R < n) {

            map.put(chars[R], map.getOrDefault(chars[R], 0) + 1);
            sequence = Math.max(sequence, map.get(chars[R]));

            if ((R - L + 1) - sequence > k) {
                map.put(chars[L], map.getOrDefault(chars[L], 0) - 1);
                L++;
            }

            maxLength = Math.max(maxLength, R - L + 1);
            R++;
        }

        return maxLength;
    }
}


//Input: s = "ABAB", k = 2
//        Output: 4
//        Explanation: Replace the two 'A's with two 'B's or vice versa.

//Input: s = "AABABBA", k = 1
//        Output: 4
//        Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//        The substring "BBBB" has the longest repeating letters, which is 4.
//        There may exists other ways to achieve this answer too.


//0 1 2 3 4 5 6
//A A B A B B A
//        !
//!
