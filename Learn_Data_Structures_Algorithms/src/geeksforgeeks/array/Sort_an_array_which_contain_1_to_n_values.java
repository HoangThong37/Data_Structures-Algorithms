package geeksforgeeks.array;

public class Sort_an_array_which_contain_1_to_n_values {

    // Input : arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
    // Output : 1 2 3 4 5 6 7 8 9 10

    //    You have given an array which contain 1 to n element,
    //    your task is to sort this array in an efficient way
    //    and without replace with 1 to n numbers.

    static void sortArr(int[] arr) {
        int n = arr.length;

        sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    private static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int preIndex = arr[i] - 1; // ptu sau i
            //if ()
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,52,1,6,8,0,77,33,22};

    }



}
