package Sorting_thuattoansapxep.testtt;

public class insert_sort {

   void insert_sort(int[] arr) {
        // sxep chèn
        // bắt đầu từ vtri 2, arr[1] -> arr[n]
        // so sánh phần tử hiện tại với phần tử trước của nó
        // nếu ptu chính nhỏ hơn ptu trước, hãy so sánh tiếp với ptu trc đó
        // di chuyển các ptu trước  lớn hơn lên 1 vị trí để tạo khoảng trống cho
        // vị trí bị hoán đổi

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        //InsertionSort ob = new InsertionSort();
        insert_sort ob = new insert_sort();
        ob.insert_sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
