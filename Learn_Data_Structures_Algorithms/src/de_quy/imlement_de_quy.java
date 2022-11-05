package de_quy;

// Tính giai thừa
public class imlement_de_quy {
    public static int GiaiThua(int n) {
        if (n == 0) {
            // bài toán cơ sở
            return 1;
        }
        // bài toán quy nạp
        return n * GiaiThua(n-1);
    }
    public static void main(String[] args) {
        System.out.println(GiaiThua(0));
        System.out.println(GiaiThua(4));
        System.out.println(GiaiThua(5));
        System.out.println(GiaiThua(3));
        System.out.println(GiaiThua(10));
    }

}
