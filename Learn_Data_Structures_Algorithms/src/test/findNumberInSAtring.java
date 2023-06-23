package test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findNumberInSAtring {

//    public static void main(String[] args) {
//        String test = "abc62hskfjah8";
//        // sử dụng lớp Pattern trong java.util.regex
//
//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher(test);
//        //System.out.println(matcher);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
//    }

    // Viết chương trình đếm số từ trong một chuỗi trong Java
//    public static void main(String[] args) {
//        String test = "Hello word";
//        int count = 0;
//        for (int i = 0; i < test.length(); i++) {
//            if (test.charAt(i) != ' ') {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }

     // đếm số lần xuất hiện của 1 kí tự trong chuỗi java
//     public static void main(String[] args) {
//         String test = "Thong dep trai vl LongestWord LongestWord hihi ee";
//
//         Map<Character, Integer> result = new HashMap<>();
//         // convert từ chuỗi -> mảng char
//         char[] byteChar = test.toCharArray(); // chuyển đổi (convert) chuỗi ký tự `test` thành một mảng các ký tự (char array) `byteChar`.
//
//         for (char c : byteChar) {
//             if (result.containsKey(c)) {
//                 result.put(c, result.get(c) + 1);
//             } else {
//                 result.put(c, 1);
//             }
//         }
//         System.out.println(result);
//     }

    // đếm số lần xuất hiện của chữ trong chuỗi java
    // tách nhau bởi khoảng trắng
    // .split("")
//    public static void main(String[] args) {
//        String test = "Thong dep trai vl LongestWord LongestWord hihi ee";
//        Map<String, Integer> result = new HashMap<>();
//        String[] arr = test.split(" ");
//        for (String item : arr) {
//            if (result.containsKey(item)) {
//                result.put(item, result.get(item) + 1);
//            } else {
//                result.put(item, 1);
//            }
//        }
//        System.out.println(result);
//    }

    public static void main(String[] args) {
        // đảo ngược chuỗi string bằng byte
        String test = "Thong dep trai vl LongestWord LongestWord hihi ee";

        byte[] bytes = test.getBytes();
        byte[] arrBytes = new byte[test.length()]; //  tạo 1 mảng với số lượng ptu = so lượng chuỗi.

        for (int i = 0; i < bytes.length; i++) {
            arrBytes[i] += bytes[bytes.length - i - 1];
        }
        System.out.println(new String(arrBytes));
    }







}
