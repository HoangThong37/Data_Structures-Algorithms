package geeksforgeeks.array;

import java.util.Arrays;

public class Rearrange_an_array_in_maximum_minimum {

//    Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}
//    Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

    static void Rearrange(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // 1, 2, 3, 4, 5, 6, 7
        int a = 0;
        int b = n - 1;
        int[] arrNew = new int[n];

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag) {
                arrNew[i] = arr[b--];
            } else {
                arrNew[i] = arr[a++];
            }
            flag = !flag;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrNew[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Rearrange(arr);

    }
}
