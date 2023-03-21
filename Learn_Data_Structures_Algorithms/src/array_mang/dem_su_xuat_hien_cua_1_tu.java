package array_mang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class dem_su_xuat_hien_cua_1_tu {
    private static void characterCount(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        // sử dụng toCharArray convert chuỗi -> char
        char[] charArrays = inputString.toCharArray();
        //char[] charArrays = inputString.getBytes();
        for (char c : charArrays) { // duyệt
            if (charCountMap.containsKey(c)) { // true
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else { // false
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);
    }
    public static void main(String[] args) {
        String a = "HelloWord";
        characterCount(a);
    }
}

// ví dụ : Hello word
//  h : 1
// e : 1
// l : 2
// w: 1
// o:1
// r: 1
// d: 1