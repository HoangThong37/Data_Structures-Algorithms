package Leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class _205_isomorphic_strings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (sMap.containsKey(c1)) {
                if (c2 != sMap.get(c1)) {
                    System.out.println("đây nhé: " + sMap.get(c1));
                    return false;
                }
            } else {
                if (tMap.containsKey(c2)) {
                    return false;
                }
            }
            sMap.put(c1, c2);
            tMap.put(c2, c1);
        }
        return true;
    }



    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        System.out.println(isIsomorphic(s, t));
    }

}


/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character
        while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.
*/
