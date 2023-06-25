package test;

public class insert_sort_tiep {


    public static void main(String[] args) {
        int[] n = {2,5,11,4,1,55,3,66,23};
        //System.out.println();
        sort(n);
    }

    private static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            // thuật toán sx chèn
            int key = arr[i]; // phần tử hiện tại
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
           // 1 2 4 4
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // b1. duyệt mảng từ vị trí 2.
    // so sánh phần tử hiện tại với những phần tử trc đó
    // Nếu phần tử hiện tại < ptu đang xét,  hoán đổi vị trí cho nó
    // tiếp tục so sash và hoán đổi khi nào mà ptu hiện tại đứng đúng chỗ của nó trong mảng đã đc sx
    // lặp lại quá trình trên cho các phần tử còn lại trong mảng..



}
