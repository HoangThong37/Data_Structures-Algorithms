package geeksforgeeks.array;

public class Segregate_even_and_odd_numbers {

/*    Cho một mảng arr[] gồm các số nguyên, tách các số chẵn và số lẻ trong mảng.
     Sao cho tất cả các số chẵn phải có mặt trước, sau đó là các số lẻ.  */

//    Input: arr[] = 1 9 5 3 2 6 7 11
//    Output: 2 6 5 3 1 9 7 11

    // cách 1
    static void Segregate(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[count++] = arr[i];
            }//System.out.print(count + " ");
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                arr[count++] = arr[i];
            }//System.out.print(count + " ");
        }
    }

    // cách 2
    static void Segregate1(int[] arr) {
        int n = arr.length;

        int i = 0;
        int j = -1;

        while (i != n) { // biến chạy chạy từ i -> n
            if (arr[i] % 2 == 0) {
                j++;
                swap1(arr, i, j);
            }
            i++;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    private static void swap1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 9 ,5 ,3 ,2 ,6 ,7 ,11};
        Segregate1(arr);
    }
}
