package array_mang;

import java.util.Stack;

public class reverseString {

    public static void main(String[] args) {
        String test = "Hoang Trung Thong";
        System.out.println(reverseStrings3(test));
    }

    private static String reverseStrings3(String test) {
        // mình có cấu trúc dữ liệu Stack  (FILO)
        // đổi chuỗi =>
        Stack<Character> stack = new Stack<>();
        // bh mình push cái string vào thằng stack
        // ở đây chỉ có duyệt mảng
        for (int i = 0; i < test.length(); i++) {
            stack.push(test.charAt(i)); // push từng char vào thằng stack
        }
        // bh mình lấy ra = stringbuider để nó append
        StringBuilder stringBuilder = new StringBuilder();

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }

    private static String reverseStrings2(String test) {
        // String immutable -> nó ko thể thay đổi đc, string nó có cái hàm là toCharArrays
        // String buider thì lại có hàm reverce
        StringBuilder stringBuilder = new StringBuilder(test);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    private static String reverseStrings1(String test) {
        // cách 1
        // sử dụng string -> convert sang byte -> từ byte mình tạo 1 mảng byte[] mới
        // rồi sau đó mình for -> lấy phần tử từ sau ra trước

        byte[] byteString = test.getBytes(); // convert từ String -> byte
        byte[] newByte = new byte[byteString.length]; // số lượng phần tử là giống nhau

        for (int i = 0; i < byteString.length; i++) {
            // tại vị trí i thì mình gán nó với newByte -> ok
            newByte[i] = byteString[byteString.length - 1 - i]; // giá trị của newByte tại vtri i mình gán nó..
        }
       return new String(newByte);
    }
}
