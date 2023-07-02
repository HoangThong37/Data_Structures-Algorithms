package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {
        //int[] arr = {3,2,4,6,1,8,7,9,5};
        // sapxepchen(arr);
        String test = "thongbwm4hdg32ghdg3";

        Pattern pattern = Pattern.compile("\\d++"); // d - so khớp với các kí tự là chữ số
        Matcher matcher = pattern.matcher(test);    // ktra xem biểu thức chính quy
        while (matcher.find()) {
            if(matcher.find())// còn đúng {
            System.out.println(matcher.group());    // trả về chuỗi con phù hợp
        }


//        String[] arrStr = test.split("\\D+");
//        for (String item : arrStr) {
//            if (!item.isEmpty())   {
//              //  Character.isDigit()
//
//              //  System.out.println(item instanceof String);
//            } //
//        }
//
//
//
//             charAt() <-> Character.isDigit()  -> ktra so
//                                   .isLetter() ->
//
//            for (int i = 0; i < arrStr.length; i++) {
//               if (arrStr[i] != null) {
//                  System.out.println(arrStr[i]);
//               }
//            }
    }


//    private static void sapxepchen(int[] arr) {
//          int n = arr.length;
//
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i - 1;
//
//            while (j >= 0 && arr[j] > key) {
//
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j+1] = key;
//            // 2 3 1 4
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
    // tt sxc - sx giá trị từ nhỏ đến lớn
    // b1. mình sẽ chạy ptu từ vị trí i = 1
     // b2. s s xem ptu hien tai vs pt dung trc no, neu mà ptu hien tai nho hon ptu dung trc no thi minh lai so sanh
    // ptu htai vs các ptu dung trc no nz
    // tăng vị trí cua nhung ptu lon hon pt ht len 1 de khoang trong dó cho ptu hien tai

}
