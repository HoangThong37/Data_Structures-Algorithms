package Leetcode.easy;

public class _88_Merge_Sorted {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        // chèn ptu của n2 vào tk n1
        for (int a : n2) {
            insert(a, n1, m);
            m++;
        }
    }
    private static void insert(int a, int[] n1, int m) {
        // a: phần tử cần chèn
        // tìm cái vị trí mà cần chèn vào (k > chèn)
        boolean findK = false;
        for (int k = 0; k < m; k++) {
            if (n1[k] > a) {
                findK = true;
                for (int i = m - 1; i >= k; i--) {
                    n1[i + 1] = n1[i];
                }
                n1[k] = a;
                break;
            }
        }
        if (findK == false) {
            // vị trí cuối cùng chính là phần tử cần điền vô là a
            n1[m] = a;
        }
    }
    public static void main(String[] args) {
        int[] num1 = {1,4,7,88,0,0,0};
        int[] num2 = {3, 5, 888};
        merge(num1, 4, num2, 3);
        System.out.println("Done");
    }
}
