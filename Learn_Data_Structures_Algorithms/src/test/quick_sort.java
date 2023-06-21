package test;

public class quick_sort {

    void sort(int[] arr, int low, int hight) {
        if (low < hight) {
            // chốt
            int pi = partition(arr, low, hight);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, hight);
        }
    }

    private int partition(int[] arr, int low, int hight) {
        int pivot = arr[hight];
        int i = low - 1;

        for (int j = low; j < hight; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        // swap phần tử mình chọn pivot = hight với i+1
        int temp = arr[i + 1];
        arr[i+1] = arr[hight];
        arr[hight] = temp;

        return i+1;
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
        int n = arr.length;

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        quick_sort ob = new quick_sort();
        ob.sort(arr, 0, n - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
