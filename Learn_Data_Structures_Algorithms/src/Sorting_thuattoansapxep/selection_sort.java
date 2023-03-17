package Sorting_thuattoansapxep;

import java.util.Arrays;

public class selection_sort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i; // 0 0
            for (int j = minIndex + 1; j < n; j++) { // 2 1 => minindex = 0
                if (arr[minIndex] > arr[j]) {
                    minIndex = j; // minindex = 1
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }


            printArray(i, arr);
        }
    }

    private static void printArray(int i, int[] arr) {
        System.out.printf("%d : ", i);
        for (int k = 0; k < arr.length; k++) {
            System.out.printf("%d ", arr[k]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 5, 3,};
        selectionSort(a);
    }
}

// selection_sort = sắp xếp chọn
// -- độ phức tạp : 0(n2)

// Nguyên lí :
//  b1. chạy từ đầu mảng đến cuối mảng
//  b2. Tại vòng lặp i, tìm phần tử nhỏ nhất từ [i+1, n-1] nếu nhỏ hơn i thì đổi chỗ cho a[i]
//  b3. Sau vòng lặp i, thì dãy [0->i] đã sắp xếp