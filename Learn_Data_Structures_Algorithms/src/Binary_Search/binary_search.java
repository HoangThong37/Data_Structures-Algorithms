package Binary_Search;

public class binary_search {
    // cách 1. Sử dụng vòng lặp
    public static int binary(int[] arr, int key) { // method tìm kiếm nhị phân
        // ologn
        int n = arr.length;
        return binary_search2(arr, key, 0, n-1);
    }

    private static int binary_search2(int[] arr, int key, int left, int right) {
        if (left > right) return  -1;
        int mid = (left+right)/2;
        if (key == arr[mid]) return mid;
        if (key <arr[mid]) {
            return binary_search2(arr, key, 0, mid-1);
        } else {
            return binary_search2(arr,key,mid+1, right);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 15, 33, 44, 55, 77, 88};
        System.out.println(binary(a, 7));
       // System.out.println(binary(a, 3));

    }

}

//    public static int binarySearch(int[] a, int key) {
//        int n = a.length;
//        return binarySearch(a, key, 0, n-1);
//    }
//    public static int binarySearch(int[] a, int key, int iLeft, int iRight) {
//        if (iLeft > iRight) {
//            return -1;
//        }
//        int iMid = (iLeft + iRight) / 2;
//        if (key == a[iMid]) {
//            return iMid;
//        } else if (a[iMid] > key) {
//            return binarySearch(a, key, 0, iMid-1);// key -trái
//        } else {
//            return binarySearch(a, key, iMid + 1, iRight);
//        }
//    }



//        int n = a.length;
//        int iL = 0;
//        int iR = n - 1;
//        while (iL <= iR) {
//            int iMid = (iL + iR) / 2;
//            System.out.println("[ iLeft : " + iL + "," + " iRight : " + iR + "] xét : " + iMid) ;
//            if (key == a[iMid]) {
//                return iMid;
//            } else if (key > a[iMid]) {
//                iL = iMid + 1;
//            } else {
//                iR = iMid - 1;
//            }
//        }
//        return -1; // mảng a đã sx, // nếu key ko tồn tại thì = -1


//    public static void main(String[] args) {
//        int[] a = {1, 3, 5, 7, 9, 11, 15, 33, 44, 55, 77, 88};
//        System.out.println(binarySearch(a, 33));
//
//    }





