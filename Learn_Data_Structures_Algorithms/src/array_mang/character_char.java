package array_mang;

public class character_char {
    public static void main(String[] args) {
        String s = "Thong hello HI HI CHĂM CHỈ 2357";
//        for (int i = 0; i < s.length(); i++) {
//            char index = s.charAt(i);
//            System.out.println(index);
//        }

//        for (int i = 0; i < s.length(); i++) {
//            char index = s.charAt(i);
//            if (Character.isDigit(index) == true) {
//                System.out.print(index + " ");
//            }
//        }

//        for (int i = 0; i < s.length(); i++) {
//            char index = s.charAt(i);
//            if (index > 'A' && index < 'Z') {
//                System.out.print(index + " ");
//            }
//        }

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(" s1 == s2 => " + (s1 == s2));
        System.out.println(" s2 == s3 => " + (s2 == s3));
        System.out.println(" s1 == s3 => " + (s1 == s3));

        System.out.println("s1.equals(s2) =>  " + (s1.equals(s2)));
        System.out.println("s2.equals(s3) =>  " + (s2.equals(s3)));
        System.out.println("s1.equals(s2) =>  " + (s1.equals(s3)));

    }
}

// String được tạo thành từ các Character
// char là kiểu nguyên thủy của Character
// char mặc định là mã ascii và có thể bd bằng số
// String pool
// equals : so sánh nội dung
// == : so sánh 2 cái Object nó có cùng trỏ vào cùng 1 cái Object hay k
