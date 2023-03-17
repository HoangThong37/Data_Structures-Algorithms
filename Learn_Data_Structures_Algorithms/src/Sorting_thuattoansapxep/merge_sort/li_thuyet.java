package Sorting_thuattoansapxep.merge_sort;

public class li_thuyet {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // tìm điểm chính giữa
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);          //đệ quy
            mergeSort(arr, mid+1, right);                      //      1 2 3 4 5 6 7 8 9

            merge(arr, left, mid, right); // merge
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // tìm kích thước của 2 mảng left, right.
        int n1 = (mid - left) + 1;
        int n2 = right - mid;

        int arr1[] = new int[n1]; // tạo mảng tạm chứa số phần tử left
        int arr2[] = new int[n2]; // tạo mảng tạm chứa số phần tử right

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[left + i]; // set vào arr1
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[mid+1+j]; // set vào arr2 ... từ vị trí mid + 1
        }

        // chỉ mục ban đầu
        int i = 0; // chỉ mục ban đầu của mảng
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {    // arr1[i] là mảng bên trái
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
             k++;
        }
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,23,5,2,44,22,43,12};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

}

//  Sắp xếp trộn => 1 trong 2 phổ biến tối ưu hơn
//  ý tưởng  : chia đôi ra -> trộn vào (vừa trộn vừa sắp xếp)
//       1 5 3 2 8 7 6 4 => chia ra thành 2 phần rồi chia hết ra đến lúc thành 1 phần tử
// => chúng ta coi mảng 1 phần tử là mảng đã sắp xếp
// => trộn 2 mảng đã sắp xếp với nhau
//  1     5     3     2       8       7      6      4
//=> 1 vs 5 ->  1 5
//-> 3 với 2 -> 2 3
// => trộn 2 mảng trên lại vs nhau


//-> 8 với 7 -> 7 8
//-> 6 với 4 -> 4 6
// => trộn 2 mảng trên lại vs nhau

//=> trộn mảng cuối cùng là xong

//   Độ phức tạp thời gian trong trường hợp xấu nhất, tốt nhất, trung bình của Merge Sort đều là O(nlogn), điều này làm cho Merge Sort tỏ ra khá hiệu quả.
//   Merge sort là một lựa chọn khi cần một thuật toán để sắp xếp có tính ổn định, khác với quick sort, không ổn định cho lắm.
//    Nhược điểm của merge sort có thể kể đến như không hiệu quả lắm về mặt không gian, khi độ phức tạp không gian trong trường hợp xấu nhất là O(n)
//    trong khi của quick sort là O(1)