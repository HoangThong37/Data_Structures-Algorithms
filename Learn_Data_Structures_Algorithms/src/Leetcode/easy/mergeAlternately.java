package Leetcode.easy;

public class mergeAlternately {

    public static void main(String[] args) {
        StringBuilder merged = new StringBuilder();
        String word1 = "hello";
        String word2 = "thong";

        int w1 = word1.length();
        int w2 = word2.length();
        int l = Math.min(w1, w2);

        for (int i = 0; i < l; i++) {
            merged.append(word1.charAt(i)).append(word2.charAt(i));
        }

        System.out.println(merged);
    }

//    public String mergeAlternately(String word1, String word2) {
////        //char[] w2 = word2.toCharArray();
//
//
//
//
//    }
}
