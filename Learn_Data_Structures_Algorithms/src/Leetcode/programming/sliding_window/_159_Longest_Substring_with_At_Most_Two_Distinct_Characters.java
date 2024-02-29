package Leetcode.programming.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _159_Longest_Substring_with_At_Most_Two_Distinct_Characters {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

            while (charCount.size() > 2) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0)
                    charCount.remove(leftChar);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "aabbccc";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
