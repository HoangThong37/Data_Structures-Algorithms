package Sorting_thuattoansapxep.merge_sort;

public class selection_sort {
    // sắp xếp chọn
    // chọn index phần tử đầu - minIndex
    // những phần tử kế tiếp thì mình s2 vs phần tử min này
    // nếu < hơn thì nình gán minIndex cho các giá trị tiếp theo
    public static void sx_chon(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // 3 4 5
            int minIndex = i; // tại vị trí 0
            for (int j = minIndex + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j; // tại vị trí 1
                }
            }
                if (minIndex != i) {
                swapTwoValue(arr, minIndex, i);
            }

        }
    }
    public static void swapTwoValue(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,5};
        sx_chon(arr);
        // 3, 4, 2, 5
        // 3 , 4, 2
    }
}
