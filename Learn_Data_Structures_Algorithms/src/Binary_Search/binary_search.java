package Binary_Search;

public class binary_search {
    // cách 1. Sử dụng vòng lặp
    public static int binarySearch(int[] a, int key) {
        int n = a.length;
        return binarySearch(a, key, 0, n-1);
    }
    public static int binarySearch(int[] a, int key, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return -1;
        }
        int iMid = (iLeft + iRight) / 2;
        if (key == a[iMid]) {
            return iMid;
        } else if (a[iMid] > key) {
            return binarySearch(a, key, 0, iMid-1);// key -trái
        } else {
            return binarySearch(a, key, iMid + 1, iRight);
        }
    }






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
//        return -1; // mảng a đã sx, // nếu àm key ko tồn tại thì = -1


    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 15, 33, 44, 55, 77, 88};
        System.out.println(binarySearch(a, 33));

    }

}
// tên TV : Tìm kiếm nhị phân.
// Kĩ thuật tìm kiếm trong 1 mảng mà mảng đó đã được sắp xếp
// Các ví dụ thực tế:
//  Khi chúng ta tìm tới trang sách 100 thì chúng ta đầu tiên thì sẽ bổ đôi cái trang sách ra trước..
// vd2 :  tìm số báo danh/ tên của bạn ....
// 2. Ys tưởng : Chia để trị
// [1 2 5 7 11 23 34 56 76] -> tim 34 ở đâu
// 1. bổ đôi. lấy cái giữa
// 2.  s2 xem cái giá trị cần tìm với giá trị bổ đôi đó
// 3. ...
//

// CÀI ĐẶT THUẬT TOÁN
// C1. Sử dụng vòng lặp
// C2. Sử dụng đệ quy
// btaap leetcode 704


