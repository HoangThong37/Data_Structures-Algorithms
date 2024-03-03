package Leetcode.programming.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _340_Longest_Substring_with_At_Most_K_Distinct_character {

    public static void main(String[] args) {
        String s = "aa";
        int k = 1;
        System.out.println(lengthOfLongestSubstring(s, k));
    }

    private static int lengthOfLongestSubstring(String s, int k) {
        char[] character = s.toCharArray();
        int L = 0, R = 0;
        Map<Character, Integer> characters = new HashMap<>(); // define table
        int n = character.length;
        int maxLength = 0; // define max length

        while (R < n) {
            characters.put(character[R], characters.getOrDefault(character[R], 0) + 1);

            while (characters.size() > k) {
                characters.put(character[L], characters.get(character[L]) - 1);
                if (characters.get(character[L]) == 0) {
                    characters.remove(character[L]);
                }

                L++;
            }

            maxLength = Math.max(maxLength, R - L + 1);
            R++;
        }

        return maxLength;
    }
}

// given a string s and an interger k, return the length of the longest substring
// of s that contains at most k distinct character
