package test1;

public class insertionsort {

    public static void main(String[] args) {
        // thuật toán sắp xếp insert-tion sort - thuật toán sắp xep chèn
        // bd tại vị trí i = 1

        int[] arr = {1,4,3,2,6,5,8};
        sort1(arr);
    }

    private static void sort1(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
