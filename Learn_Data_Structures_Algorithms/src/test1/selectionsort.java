package test1;

public class selectionsort {
    // thuật toán sx chọn - độ phức tạp thuật toán là On2
    // chọn ptu có khóa nhỏ nhật trong n phần tử từ a[0] - a[n-1] và hoán vị nó vs a[0]
    // chọn ptu có khóa nhỏ nhất từ a[1] - > n-1 và hoán vị nó với a1
    // tiếp tục các bc như vậy
    private static void sort1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minValue = i;
            for (int j = minValue + 1; j < n; j++) {
                if (arr[minValue] > arr[j]) {
                    minValue = j;   // lúc nafy minvalue = j rồi
                }
            }
            if (minValue != i) {
                swap1(arr, minValue, i);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap1(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        // thuật toán sắp xếp selection sort - thuật toán sắp xep chèn
        // bd tại vị trí i = 1

        int[] arr = {1,4,3,2,6,5,8};
        sort1(arr);
    }

}
