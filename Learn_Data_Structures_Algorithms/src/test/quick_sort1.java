package test;

public class quick_sort1 {

    void sort(int[] arr, int left, int right) {
        if (left < right) {
            int key = partition(arr, left, right);
            sort(arr, left, key - 1);
            sort(arr, key + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        //
        //int n = arr.length;
        int pivot = arr[right];
        int j = left - 1;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                j++;
                swap1(arr, i, j);
            }
        }
        swap1(arr, j + 1, right);


        return j + 1;
    }

    private void swap1(int[] arr, int i, int j) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



    public static void main(String[] args) {
        int arr[] = { 10, 80, 30, 90, 40, 50, 70 };

        int n = arr.length;

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        quick_sort1 ob = new quick_sort1();
        ob.sort(arr, 0, n - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }


}
