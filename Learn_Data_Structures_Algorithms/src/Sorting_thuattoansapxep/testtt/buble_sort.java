package Sorting_thuattoansapxep.testtt;

public class buble_sort {

    void bubles_sort(int[] arr) {
        // sxep nổi bọt
        // 2 vòng lặp
        // nếu ptu sau > ptu trước thì đổi chỗ
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void insert_sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
           int key = arr[i];
           int j = i - 1;
           while (j >= 0 && key < arr[j]) {
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
        buble_sort ob = new buble_sort();
        ob.bubles_sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
