package de_quy;

public class Fibonacci {
    public static  int Fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
        System.out.println(Fibonacci(9));

    }
   // con 31->38
}

// Mỗi phần tử thì nó luôn bằng tổng 2 phần tử trước đó
//     F(1) = 1 - Bài toán CƠ SỞ
//     F(2) = 1 - BT CƠ SỞ
// -=> F(n) = F(n -1) + F(n-2) - CÔNG THỨC QUY NẠP