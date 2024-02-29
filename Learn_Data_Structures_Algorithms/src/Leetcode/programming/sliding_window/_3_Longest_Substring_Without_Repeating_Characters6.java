package Leetcode.programming.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _3_Longest_Substring_Without_Repeating_Characters6 {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (charIndexMap.containsKey(current)) {

                left = Math.max(left, charIndexMap.get(current) + 1);
            }
            charIndexMap.put(current, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

// Given a string s, find the length of the longest substring without repeating characters.
// Example 1:
//
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.