package Sorting_thuattoansapxep;

public class bubble_sort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
                //System.out.println(arr[j] + " ");
            }

        }
    }



    private static void swap(int[] arr ,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 8, 5, 2, 10, 33, 11, 15, 24};
         bubbleSort(a);
     //  System.out.println(bubbleSort(LongestWord));
    }
}

// độ phức tạp thuật toán : O(n2)
// bubble sort : thuật toán sắp xếp nổi bọt

// + NGUYÊN LÍ :
// b1. chạy từ đầu mảng đến cuối mảng
// b2. nếu ptu i > i+1 thì mình đổi chỗ
//  + sau mỗi vòng lặp thì ptu lớn hơn sẽ trôi xuống dưới

// + nhược điểm : pải chạy từ đầu mảng đến cuối mảng