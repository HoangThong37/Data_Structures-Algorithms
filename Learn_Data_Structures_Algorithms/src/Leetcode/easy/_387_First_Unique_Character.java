package Leetcode.easy;

import java.util.concurrent.LinkedTransferQueue;

public class _387_First_Unique_Character {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray(); // convert sang char array
        int[] count = new int[123];
        for (int i = 0; i < arr.length; i++) {
            // tại kí tự char c này
            char c = arr[i];
            int index = c;
            count[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = c;
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
// 1. convert các kí tự thành số
// 2. đếm lần lượt các kí tự đó


// Given LongestWord string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
// Cho một chuỗi s, tìm ký tự không lặp lại đầu tiên trong chuỗi đó và trả về chỉ mục của nó. Nếu nó không tồn tại, trả về -1.

//  Input: s = "leetcode"
//  Output: 0

// Input: s = "loveleetcode"
// Output: 2