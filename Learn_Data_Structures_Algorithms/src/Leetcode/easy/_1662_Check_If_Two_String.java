package Leetcode.easy;

public class _1662_Check_If_Two_String {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        for (String s1 : word1) {
            string1.append(s1);
        }
        for (String s2 : word2) {
            string2.append(s2);
        }
        return string1.toString().equals(string2.toString());
    }
//        String s1 = "";
//        String s2 = "";
//
//        for (String str1 : word1) {
//            s1 += str1;
//        }
//
//        for (String str2 : word2) {
//            s2 += str2;
//        }
//        return s1.equals(s2);
//    }
}

 //   Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 //   A string is represented by an array if the array elements concatenated in order forms the string.

//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//        Output: true
//        Explanation:
//        word1 represents string "ab" + "c" -> "abc"
//        word2 represents string "a" + "bc" -> "abc"
//        The strings are the same, so return true.


// tăng tốc độ làm việc của String
// sinh ra để tối ưu hóa hơn việc tối ưu hóa bộ nhớ cũng như tốc độ chưng trình của thằng String
// String : tốn nhiều performan hơn
// StringBuider : tốc độ nhanh hơn rất là nhiều vì nó append chuỗi vô chứ ko tạo 1 cái Object mới r nối
