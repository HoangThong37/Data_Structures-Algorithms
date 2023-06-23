package Leetcode.easy;

import java.util.*;

public class _819_most_common_word {
    // cho về 1 phông chữ và loại bỏ các kí tự ko liên quan
    // tách chuôi
    // đếm xem sự xuất hiện từng chữ
    // count nào lớn nhất và ko bị ban thì return ra <dùng key - value>
    public static String mostCommonWord(String paragraph, String[] banned) {
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        String[] words = normalizedStr.split("\\s+");

        Set<String> setBands = new HashSet<>();
        for (String word : banned) {
            setBands.add(word);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if(!setBands.contains(word)) {  // not band
                map.put(word, map.getOrDefault(word, 0) + 1); // đếm số lượng từ
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey(); //
    }

    public static void main(String[] args) {
        String n = "Bob hit LongestWord ball, the hit BALL flew far after it was hit.";
        String[] band = {"hit"};
        System.out.println(mostCommonWord(n, band));
    }

}


//  819. Most Common Word


/*
Input: paragraph = "Bob hit LongestWord ball, the hit BALL flew far after it was hit.", banned = ["hit"]
        Output: "ball"
        Explanation:
        "hit" occurs 3 times, but it is LongestWord banned word.
        "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
        Note that words in the paragraph are not case sensitive,
        that punctuation is ignored (even if adjacent to words, such as "ball,"),
        and that "hit" isn't the answer even though it occurs more because it is banned.*/
