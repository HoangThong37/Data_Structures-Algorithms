package geeksforgeeks.array;

import java.util.Arrays;

public class Rearrange_array_such_that_even {

/*    Input : A[] = {1, 2, 2, 1}
    Output :  1 2 1 2
    Explanation :
    For 1st element, 1  1, i = 2 is even.
            3rd element, 1  1, i = 4 is even.*/

     static void rearrange(int[] arr) {
         int n = arr.length;  // 1 2 2 1

         Arrays.sort(arr); // 1 1 2 2
         int a = 0;      // biến chạy đầu
         int b = n - 1; // biến chạy từ vị trí cuối
         int[] res = new int[n];

         for (int i = 0; i < n; i++) {
             if ((i + 1) % 2 == 0) {
                 res[i] = arr[b--];
             } else {
                 res[i] = arr[a++];
             }
         }
         for (int i = 0; i < n; i++) {
             System.out.print(res[i] + " ");
         }
     }

    public static void main(String[] args) {
        int A[] = {1, 2, 2, 1};
        rearrange(A);
    }
}
