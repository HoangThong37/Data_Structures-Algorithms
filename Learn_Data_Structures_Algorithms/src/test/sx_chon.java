package test;

public class sx_chon {

     void  sx_chon1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) { // tìm ptu nhỏ nhất chưa đc sx
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {3,2,4,6,1,5,7};
        sx_chon sx = new sx_chon();
        sx.sx_chon1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
