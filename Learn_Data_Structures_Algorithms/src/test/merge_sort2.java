package test;

public class merge_sort2 {

    // BƯỚC 1. tìm chỉ số mảng bđ mid - tách mảng làm 2
    // b2. gọi đệ quy cho mảng bên trái
    // b3: gọi đệ quy cho mảng bên phải
    // b4. gộp mảng
    //

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6, 3};

        System.out.println("Mảng ban đầu:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sort22(arr, 0, arr.length - 1);

        System.out.println("\nMảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void sort22(int[] arr, int left, int right) {
        if (left < right) {
             int mid = (left + right) / 2;

             sort22(arr, left, mid);
             sort22(arr, mid+1, right);

             sort_merge(arr, left, mid, right);
        }
    }

    private static void sort_merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1; // số lượng phần tử từ  0 -> mid
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


}
