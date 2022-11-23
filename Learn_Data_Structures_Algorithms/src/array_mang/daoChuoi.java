package array_mang;

import java.util.Stack;

public class daoChuoi {
    // hoang trung thong
    public static void main(String[] args) {
        String test = "Hello abc"; // -> byte
        byte[] testChar = test.getBytes(); // [11,22,33,.. j đó]
        byte[] arrReverse = new byte[test.length()]; // số lượng ptu mình reverse
        for (int i = 0; i < arrReverse.length; i++) {
            arrReverse[i] = testChar[arrReverse.length - i - 1];
        }
        System.out.println(new String(arrReverse));
    }


    // cách 3
//    public static void main(String[] args) {
//        String string = "Hoang Trung Thong";
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < string.length(); i++) {
//            stack.push(string.charAt(i)); // lưu vào stack, get ra thì nó sẽ lấy sau ra
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        int size = stack.size();
//        for (int i = 0; i < size; i++) {
//            // get ra -> tạo 1 chuỗi -> hiệu quả tốt nhất : stringbuider
//            stringBuilder.append(stack.pop());
//        }
//        System.out.println(stringBuilder.toString());
//    }

   // c1
//    public static void main(String[] args) {
//        String string = "Hoang Trung Thong";
//        StringBuilder stringBuilder = new StringBuilder(string);
//        System.out.println(stringBuilder.reverse());
//        // reserve nó được cung cấp trong StringBuider
//    }


    // c2
//    public static void main(String[] args) {
//        String string = "Hoang Trung Thong";
//        // convert -> char
//        byte[] convertByte = string.getBytes(); // trả về mảng byte của chuỗi
//        byte[] result = new byte[convertByte.length]; // [ ]
//
//        for (int i = 0; i < convertByte.length; i++) {
//            result[i] = convertByte[convertByte.length - i - 1];
//        }
//        System.out.println(new String(result));
//    }


}
