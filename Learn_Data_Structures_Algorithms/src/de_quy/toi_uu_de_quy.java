package de_quy;

public class toi_uu_de_quy {
    // Đệ quy có nhớ
    static int[] F = new int[1000];
    public static  int Fibonacci2(int n) {
        if (F[n] != 0)
            return F[n];
        System.out.println(" Cần tính F[" + n +"] = ?");
        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] =  Fibonacci2(n-1) + Fibonacci2(n-2);
        return F[n];
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci2(10));
    }
}

//1. Kĩ thuật đầu tiên :
//- Đệ quy có nhớ :Lưu lại cái  kết quả trước đó