package geeksforgeeks.array;

import java.util.ArrayList;
import java.util.List;


public class Move_all_zeroes_to_end_of_array {

/*    Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
      Output  :  arr[] = {1, 2, 4, 3, 5, 0, 0, 0};  */

    static void pushZerosToEnd(int arr[]) {
        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
    }


    // cách 2.
    static void pushZerosToEnd2(int arr[]) {
        int n = arr.length;

        // 2 biến chạy i và j
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // đổi chỗ arr[i] với arr[j]
                swap(arr, i, j);
                j++;
            }
        }
        // 1, 9, 0, 4, 0
        //
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main (String[] args)  {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd2(arr);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i= 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }
}
