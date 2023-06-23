package geeksforgeeks.array;

public class Reversal_algorithm_for_Array_rotation {

    // Given an array arr[] of size N, the task is to rotate the array by d position to the left.
    //Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
    //Output: 3, 4, 5, 6, 7, 1, 2

    static void Reversal(int[] arr, int d) {
        int n = arr.length;
        int[] newArr = new int[n];
        int a = 0; // biến chạy sau d - bđ từ 0
        int b = d;
        for (int i = b; i < n; i++) {
            newArr[a++] = arr[i];
        }
        for (int i = 0; i < b; i++) {
            newArr[a++] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    // cách 2 - dùng đệ quy
    // ý tưởng : chia mảng thành 2 block
    // đảo ngược 2 block trên + đảo ngược lại mảng
     static void Reversal1(int[] arr, int d) {
         int n = arr.length;
         if (d == 0) return;
         d = d % n;
         if (n > 0) {
             swapArray(arr, 0, d - 1);
             swapArray(arr, d, n - 1);
             swapArray(arr, 0, n - 1);
         } else {
             System.out.println("Length arr > 0");
         }
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
     }

    private static void swapArray(int[] arr, int i, int j) {
         // 2 3 4 5 -> 5 4 3 2
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5, 6, 7};
       int d = 10;
       Reversal1(arr, d);
    }

}
