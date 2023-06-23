package geeksforgeeks.array;

import java.util.Arrays;

public class Sort_an_array_in_wave_form {
    // Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
    // Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}

    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
    // sắp xếp arr sao có dạng sóng

    static void sortArray(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);
        for (int i = 0; i < n; i+=2) {
            swap(arr, i, i+1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] n = {10, 80, 6, 3, 2, 20, 100, 5};
        sortArray(n);
    }
}
