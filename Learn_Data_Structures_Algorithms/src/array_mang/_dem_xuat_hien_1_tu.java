package array_mang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _dem_xuat_hien_1_tu {

    public static void main(String[] args) {
        String str = "Thongbemthonghihibemfhfhfs";

        countString(str);
    }

    private static void countString(String str) {

        char[] strChar = str.toCharArray();
        Arrays.sort(strChar);

        int count = 1;
        char index = strChar[0];

        for (int i = 1; i < strChar.length; i++) {
            if (index == strChar[i]) {
                count++;
            } else {
                System.out.println("Kí tự : " + index + " - số lần xuất hiện : " + count);
                index = strChar[i];
                count = 1;
            }
        }
        System.out.println("Kí tự : " + index + " - số lần xuất hiện : " + count);
    }


//    private static void countString(String str) {
//
//        char[] charStr = str.toCharArray();
//
//        Map<Character, Integer> res = new HashMap<>();
//
//        for (char c : charStr) {
//            if (res.containsKey(c)) {
//                res.put(c, res.get(c) + 1);
//            } else {
//                res.put(c, 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> entry : res.entrySet()) {
//            char a = entry.getKey();
//            int  b = entry.getValue();
//            System.out.println("Kí tự : " + a + " - số lần xuất hiện : " + b);
//        }
//    }
}
