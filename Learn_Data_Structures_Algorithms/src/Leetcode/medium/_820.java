package Leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _820 {

    public static int minimumLengthEncoding(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        for (String s : words) {
            for (int i = 1; i < s.length(); i++) {
                wordSet.remove(s.substring(i));
            }
        }

        int count = 0;
        for (String s : wordSet) {
            count += s.length() + 1;
        }

        return count;

        // time 0(n2)
        // space : 0(n)
    }


//    public static int minimumLengthEncoding(String[] words) {
//        Arrays.sort(words, (a, b) -> b.length() - a.length());
//        StringBuilder result = new StringBuilder();
//        for (String i : words) {
//            if (result.indexOf(i + "#") == -1) {
//                result.append(i + "#");
//            }
//        }
//        return result.length();
      // time : O(NlogN)
      // Space : O(length of all word)
//    }

    public static void main(String[] args) {
       String[] word = {"time", "me", "bell"};
       // String[] word = {"me", "time"};
       // String[] word = {"feipyxx","e"};
        System.out.println(minimumLengthEncoding(word));
    }
}

//Example 1:
//
//        Input: words = ["time", "me", "bell"]
//        Output: 10
//        Explanation: A valid encoding would be s = "time#bell#" and indices = [0, 2, 5].
//        words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "time#bell#"
//        words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "time#bell#"
//        words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#bell#"