package test1;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class test2 {


    // buble sort
/*    private static void sortTest(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    swapTest(arr, j, j+1);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/

    // insertion sort - thuật toán sắp chèn
/*    private static void sortTest(int[] arr) {
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
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }*/


    // selection sort - thuật toán sắp xếp chọn
/*    private static void sortTest(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;

            for (int j = minIndex; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swapTest(arr, minIndex, i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/

    // merge sort
/*    private static void sortTest(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sortTest(arr, low, mid);
            sortTest(arr, mid + 1, high);
            mergeS(arr, low, mid, high);
        }

    }

    private static void mergeS(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] l1 = new int[n1];
        int[] r1 = new int[n2];

        for (int i = 0; i < n1; i++) {
            l1[i] = arr[low + i];
        }

        for (int i = 0; i < n2; i++) {
            r1[i] = arr[mid + 1 + i];
        }

        int i1 = 0, j1 = 0;
        int k = low;

        while (i1 < n1 && j1 < n2) {
            if (l1[i1] < r1[j1]) {
                arr[k] = l1[i1];
                i1++;
            } else {
                arr[k] = r1[j1];
                j1++;
            }
            k++;
        }

        while (i1 < n1) {
            arr[k] = l1[i1];
            i1++;
            k++;
        }

        while (j1 < n2) {
            arr[k] = r1[j1];
            j1++;
            k++;
        }
    }*/

//    quick sort
//    private static void sortTest(int[] arr, int low, int high) {
//        if (low < high) {
//            int pivot = partition(arr, low, high);
//            sortTest(arr, low, pivot - 1);
//            sortTest(arr, pivot + 1, high);
//        }
//    }
//
//    private static int partition(int[] arr, int low, int high) {
//        int n = arr.length;
//        int pivot = arr[high];
//
//        int j = low - 1;
//        for (int i = low; i < n; i++) {
//            if (arr[i] < pivot) {
//                j++;
//                swapTest(arr, j, i);
//            }
//        }
//        swapTest(arr, j+1, high);
//
//        return j+1;
//    }


//    private static void swapTest(int[] arr, int i, int j) {
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }

    //    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, 3, 7, 4, 9};
//        int n = arr.length;
//        sortTest(arr, 0, n - 1);
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
    public static void main(String[] args) {
        //int[] arr = {5, 2, 9, 1, 7, 6, 3};
        //Arrays.sort(arr);
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(find(arr, 6));
    }

    private static int find(int[] arr, int key) {
        int n = arr.length;
        return binarySearchImpl(arr, key, 0, n-1);
    }

    private static int binarySearchImpl(int[] arr, int key, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;


        if (arr[mid] == key) return mid;

        if (arr[mid] < key) {
            return binarySearchImpl(arr, key, mid+1, high);
        } else {
            return binarySearchImpl(arr, key, low, mid-1);
        }
    }
}
