package Sorting_thuattoansapxep;

public class bubble_sort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;
                }
                //  j j+1 -> j+1 < n
                // sau mỗi vòng lặp n giảm dần j<n-i-1
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 8, 5, 2, 10, 33, 11, 15, 24};
        bubbleSort(a);
       // System.out.println(bubbleSort(a));
    }
}

// độ phức tạp thuật toán : O(n2)
// bubble sort : thuật toán sắp xếp nổi bọt

// + NGUYÊN LÍ :
// b1. chạy từ đầu mảng đến cuối mảng
// b2. nếu ptu i > i+1 thì mình đổi chỗ
//  + sau mỗi vòng lặp thì ptu lớn hơn sẽ trôi xuống dưới

// + nhược điểm : pải chạy từ đầu mảng đến cuối mảng