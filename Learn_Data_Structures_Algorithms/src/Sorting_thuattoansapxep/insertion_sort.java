package Sorting_thuattoansapxep;

public class insertion_sort {
//    public static void insertionSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int check = arr[i];
//            int j = i - 1;
//            while (j >= 0 && check < arr[j]) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = check;
//        }
//    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int check = arr[i]; // tạo biến tạm để xét giá trị
            while(j >= 0 && arr[j] > check) {
                //if (arr[j] > arr[i]) {
                    arr[j+1] = arr[j];
                    j--;
                //}
            }
            arr[j+1] = check;
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 13,14,  10, 5, 6};
        insertionSort(a);
        // System.out.println(bubbleSort(a));
    }

}

// insertion_sort = sắp xếp chèn
// -- độ phức tạp : 0(n2)

// Nguyên lí :
//  b1. chạy từ đầu mảng đến cuối mảng
//  b2. Tại vòng lặp i, ta coi dãy [0, i-1] đã sắp xếp, chèn cái phần tử i vào vị trí thích hợp
//  b3. Sau vòng lặp i, thì dãy [0, i] đã sắp xếp
