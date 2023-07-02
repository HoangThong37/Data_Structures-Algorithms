package geeksforgeeks.array;

public class Sort_an_array_which_contain_1_to_n_values {

    // Input : arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
    // Output : 1 2 3 4 5 6 7 8 9 10

    //    You have given an array which contain 1 to n element,
    //    your task is to sort this array in an efficient way
    //    and without replace with 1 to n numbers.



    private static void sort(int[] arr, int low, int height) {
        // quick sort - sx nhanh
        // chọn pivot - ở giữa...
        // sx lại mẩng theo pivot
        if (low < height) {
            int pivot = partition3(arr, low, height);
            sort(arr, 0, pivot - 1);
            sort(arr, pivot + 1, height);
        }
    }

    private static int partition3(int[] arr, int low, int height) {
        int pivot = arr[height];
        int j = low - 1;
        for (int i = low; i < height; i++) {
            if (arr[i] < pivot) {
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, j + 1, height);
        return j+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,52,1,6,8,0,77,33,22};
        int n = arr.length;
        sort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
