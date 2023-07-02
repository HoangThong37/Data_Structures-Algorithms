package test;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class insert_sort {
    // sắp xếp mảng theo thứ tự bé -> lớn
    // thuật toán sắp xếp chèn
    // bđ từ vị trí 1
    // so sánh ptu hiện tại với những ptu truoc
    // nếu ptu chính < ptu trước của nó, hãy so sánh nó với các ptu trc đó.
    // di chuyển những ptu lớn hơn lên 1 vị trí để tạo khoảng trống cho ptu bị hoán đổi

    // code tìm số trong 1 chuỗi

    public static void main(String[] args) {
        String a = "THONG3tt5jjghs8";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
//            if (Character.isDigit(c)) { // số
//                System.out.println(c + " ");
//            }

//            if (Character.isLetter(c)) { // chữ
//                System.out.print(c + " ");
//            }

//            if (Character.isUpperCase(c)) { // những kí tự hoa
//                System.out.println(c + " ");
//            }
            if (Character.isLowerCase(c)) {
                System.out.println(c + " "); // những kí tự thường
            }



        }
    }


}
