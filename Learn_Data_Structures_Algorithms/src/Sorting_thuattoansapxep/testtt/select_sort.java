package Sorting_thuattoansapxep.testtt;

public class select_sort {
    // thuật toán sx chọn
    // chạy từ đầu đến cuối
    // ta sẽ chọn phần tử nhỏ nhất trong mảng - đổi chỗ ptu A[0]
    // tại vòng lặp thứ i thì mảng từ 0 - i-1 đã đc sxep

    void select_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < min_index) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

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
        select_sort ob = new select_sort();
        ob.select_sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
