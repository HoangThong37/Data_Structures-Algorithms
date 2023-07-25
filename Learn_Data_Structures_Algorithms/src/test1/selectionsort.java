package test1;

public class selectionsort {
    // thuật toán sx chọn - độ phức tạp thuật toán là On2
    // chọn ptu có khóa nhỏ nhật trong n phần tử từ a[0] - a[n-1] và hoán vị nó vs a[0]
    // chọn ptu có khóa nhỏ nhất từ a[1] - > n-1 và hoán vị nó với a1
    // tiếp tục các bc như vậy
    private static void sort1(int[] arr) {
        int n = arr.length;
        // thuật toán sắp xếp chọn
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap1(arr, minIndex, i);
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

    private static void swap1(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6,5,8};
        sort1(arr);
    }

}
