package Leetcode.easy;

import java.util.HashMap;

public class _290_wordpattern {
//    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String words[] = s.split(" ");
            if(words.length!=pattern.length()){
                return false;
            }
            HashMap<Character, String> map = new HashMap<>();
            for(int i=0; i<pattern.length(); i++){
                char current_char = pattern.charAt(i);
                if(map.containsKey(current_char)){
                    if(!map.get(current_char).equals(words[i])){
                        return false;
                    }
                } else {
                    if(map.containsValue(words[i])){
                        return false;
                    }
                    map.put(current_char, words[i]);
                }
            }
            return true;
        }
  //  }
}

//    Given a pattern and a string s, find if s follows the same pattern.
//        Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

//Example 1:
//
//        Input: pattern = "abba", s = "dog cat cat dog"
//        Output: true
//        Example 2:
//
//        Input: pattern = "abba", s = "dog cat cat fish"
//        Output: false
//        Example 3:
//
//        Input: pattern = "aaaa", s = "dog cat cat dog"ccccc