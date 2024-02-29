package do_phuc_tap_thuat_toan;

import java.util.Scanner;

public class Time_Complexity {

    public static final int MAX = 100;
    public static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }
    public static int fib2(int n) {
        int[] F = new int[n+1];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= n; i++) {
            F[i] = F[i -1 ] + F[i-2];
        }
        return F[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập n : ");
        int n = scanner.nextInt();
        int t0 = (int) System.currentTimeMillis();
        int F1 = fib1(n);
        int t1 = (int) System.currentTimeMillis();
        int F2 = fib2(n);
        int t2 = (int) System.currentTimeMillis();
        System.out.println(" Fib1: " + F1 + " thời gian là : " + (t1 - t0));
        System.out.println(" Fib2: " + F2 + " thời gian là : " + (t2 - t1));

    }

}
// bài toán 509 leetcode

// =>  Bài toán Fibo có 2 cách : ( đệ quy ) hoặc ( mảng và vòng lặp )
// ->  đánh giá thời gian chạy c2 thòi gian chạy hơn rất nhiều