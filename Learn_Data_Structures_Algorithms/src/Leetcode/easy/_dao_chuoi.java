package Leetcode.easy;

public class _dao_chuoi {
//c1
/*    public static void main(String[] args) {
        String reverce = "Thong dep trai";
        StringBuilder builder = new StringBuilder(reverce);
        System.out.println(builder.reverse());
    }*/


// c2
//    public static void main(String[] args) {
//        String test = "Thong dep trai"; //
//        String newString = ""; // tạo chuỗi mới
//        for (int i = test.length() - 1; i >= 0; i--) { // run từ cuối lên
//            newString += test.charAt(i); // charAt : khi chúng ta muốn lấy giá trị nào đó trong chuỗi
//        }
//        System.out.println(newString);
//    }

    public static void main(String[] args) {
        String test = "Thong dep trai"; //
        byte[] test1 = test.getBytes(); // 32 100 101 112 => convert sang byte
        byte[] test2 = new byte[test1.length]; // new byte[]


        for (int i = 0; i < test1.length ; i++) {
           test2[i] += test1[test1.length - 1 - i];
        }
       System.out.println(new String(test2));

    }

}
