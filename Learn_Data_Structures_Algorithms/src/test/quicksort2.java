package test;

public class quicksort2 {

    // sắp xếp nhanh
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,0,8,5,3,5,9,7,99};
        int n = arr.length;
        quick_sort12(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quick_sort12(int[] arr, int low, int height) {
       if (low < height) {
           int pivot = partition(arr, low, height);
           quick_sort12(arr, low, pivot - 1);
           quick_sort12(arr, pivot + 1, height);
       }
    }

    private static int partition(int[] arr, int low, int height) {
        int pivot = arr[height];
        int j = low - 1;
        for (int i = low; i < height; i++) {
            if (pivot > arr[i]) {
                j++;
                swap2(arr,i,j);
            }
        }
        swap2(arr, j + 1, height);
        // 2 1 3 4 8 7 5 - 6
        return j + 1;
    }

    private static void swap2(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // chọn khóa - pivot - mid, đầu mảng, cuối mảng
    // chia đôi, chia đôi rồi sắp xếp theo pivot
    // những phần tử nhỏ hơn key -> sang bên trái
    // những ptu lon hơn key -> sang bên phải.
    // đệ quy tiếp tục các bước trên
}
