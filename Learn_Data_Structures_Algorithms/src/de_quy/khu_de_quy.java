package de_quy;

public class khu_de_quy {
    public static void main(String[] args) {
        int[] Fibo = new int[11];
        Fibo[1] = 1;
        Fibo[2] = 1;
        for (int i = 3; i <= 10; i++) {
            Fibo[i] =  Fibo[i - 1] +  Fibo[i - 2];
        }
        System.out.println(Fibo[10]);
    }
}
// Tìm cách giải bài toán mà không cần sử dụng đến đệ quy
//