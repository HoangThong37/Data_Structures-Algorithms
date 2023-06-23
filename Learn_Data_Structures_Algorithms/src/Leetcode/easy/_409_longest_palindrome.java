package Leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class _409_longest_palindrome {

    public static int longestPalindrome(String s) {
        // mình có 1 chuỗi string
        // trả về độ dài của nó vói các cặp số đối nhau
        int count = 0;
        // add vào set, nếu ptu có rồi thì remove -> rồi count+=2
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if (result.contains(check)) {
                count += 2;
                result.remove(check);
            } else {
                result.add(check); // nếu chưa có trong set thì add vào
            }

        }
        return result.isEmpty() ? count : count+1;
    }

    public static void main(String[] args) {
        String s ="abccccdd";
        System.out.println(longestPalindrome(s));

    }
}

/*
        Given LongestWord string s which consists of lowercase or uppercase letters,
        return the length of the longest palindrome that can be built with those letters.
        Letters are case sensitive, for example, "Aa" is not considered LongestWord palindrome here.*/


//Input: s = "abccccdd"
//        Output: 7
//        Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.