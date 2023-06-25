package test;

public class binarySearch {

    // mảng đã đc sx
    // thuật toán sử dụng phương pháp chia để trị
    public static void main(String[] args) {
        //int[] arr = {1,5,32,2,6,8,0,5,44,22,11,77,24,77,34};
        //Arrays.sort(arr);
         int[] arr = {1, 3, 5, 7, 9, 11, 15, 33, 44, 55, 77, 88};

        //System.out.println(bSearch(arr, 7));
        System.out.println(bSearch11(arr, 7));

    }

    private static int bSearch(int[] arr, int key) {
        int n = arr.length;
        return bSearch22(arr, key, 0 , n-1);
    }

    private static int bSearch22(int[] arr, int key, int left, int right) {
        int mid = (left + right) / 2;

        if (left > right) {
            return -1;
        }
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] > key) {
            return bSearch22(arr, key, 0, mid - 1);
        } else {
            return bSearch22(arr, key, mid + 1, right);
        }
    }

        // cách 2
        private static int bSearch11(int[] arr1, int key1) {
            int n = arr1.length;
            int left1 = 0;
            int right1 = n - 1;

            while (left1 < right1) {

                int mid1 = (left1 + right1) / 2;
                if (arr1[mid1] == key1) {
                    return mid1;
                }
                if (arr1[mid1] < key1) {
                    left1 = mid1 + 1;
                }
                if (arr1[mid1] > key1) {
                    right1 = mid1 - 1;
                }
            }
            return -1;
        }
}
