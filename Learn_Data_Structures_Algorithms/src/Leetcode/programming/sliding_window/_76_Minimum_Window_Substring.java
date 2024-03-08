package Leetcode.programming.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _76_Minimum_Window_Substring {
    public static String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0)
            return "";

        Map<Character, Integer> charCountT = new HashMap<>();
        for (char c : t.toCharArray()) {
            charCountT.put(c, charCountT.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int minWindowStart = 0;
        int count = 0;
        Map<Character, Integer> windowCounts = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (charCountT.containsKey(c)) {
                windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);
                if (windowCounts.get(c).intValue() <= charCountT.get(c).intValue()) {
                    count++;
                }
            }

            while (count == t.length()) {
                if (right - left + 1 < minWindowSize) {
                    minWindowSize = right - left + 1;
                    minWindowStart = left;
                }

                char leftChar = s.charAt(left);
                if (charCountT.containsKey(leftChar)) {
                    windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                    if (windowCounts.get(leftChar).intValue() < charCountT.get(leftChar).intValue()) {
                        count--;
                    }
                }
                left++;
            }
        }

        return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(minWindowStart, minWindowStart + minWindowSize);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t)); // Output: "BANC"
    }
}


/*
    Given two strings s and t of lengths m and n respectively, return the minimum window substring
    of s such that every character in t (including duplicates)
    is included in the window. If there is no such substring, return the empty string "".
    The testcases will be generated such that the answer is unique.
*/

/*
Example 1:
        Input: s = "ADOBECODEBANC", t = "ABC"
        Output: "BANC"
        Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:
        Input: s = "a", t = "a"
        Output: "a"
        Explanation: The entire string s is the minimum window.
Example 3:
        Input: s = "a", t = "aa"
        Output: ""
        Explanation: Both 'a's from t must be included in the window.
        Since the largest window of s only has one 'a', return empty string.
*/
