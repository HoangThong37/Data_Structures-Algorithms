package test1;

public class bublesort {


    public static void main(String[] args) {
        // thuật toán sắp xếp nổi bọt
        // độ phức tạp thuật toán là On2
        // ý tưởng : chúng ta sẽ so sánh 2 giá trị đứng liền kề nhau, nếu
        // duyệt 2 mảng
        int[] arr = {1,4,3,2,6,5,8};
        sort1(arr);
    }

    private static void sort1(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap1(arr, j , j+1);
                }
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

}
