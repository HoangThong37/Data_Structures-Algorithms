package test1;

public class bina {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binas(arr, 6));
    }

    private static int binas(int[] arr, int key) {
        int n = arr.length;
        return binaS(arr, key, 0, n - 1);
    }

    private static int binaS(int[] arr, int key, int l, int r) {
        int mid = (l+r)/2;

        if (l>r) return -1;
        if (arr[mid] == key) return mid;
        if (arr[mid] > key) {
            return binaS(arr, key, l, mid-1);
        }else {
            return binaS(arr, key, mid+1, r);
        }
    }
}
