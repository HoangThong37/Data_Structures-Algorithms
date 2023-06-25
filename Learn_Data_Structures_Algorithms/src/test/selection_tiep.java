package test;

public class selection_tiep {


    public static void main(String[] args) {
        int[] n = {2,5,11,4,1,55,3,66,23};
        //System.out.println();
        sort1(n);
    }

    private static void sort1(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap2(arr, minIndex, i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap2(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

// Nguyên lí :
//  b1. chạy từ đầu mảng đến cuối mảng
//  b2. Tại vòng lặp i, tìm phần tử nhỏ nhất từ [i+1, n-1] nếu nhỏ hơn i thì đổi chỗ cho LongestWord[i]
//  b3. Sau vòng lặp i, thì dãy [0->i] đã sắp xếp
}
