package Leetcode.easy;

public class _1672_Richest_Customer {
    public static int maximumWealth(int[][] a) {
        int soKhachHang = a.length;
        int soNganHang = a[0].length;
        int[] tongTaiSan = new int[soKhachHang];

        // tính tổng số tiền của mỗi khách hàng
        for (int i = 0; i < soKhachHang; i++) {
            int tinhTongTienKH = 0;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongTienKH += a[i][j];
            }
            tongTaiSan[i] = tinhTongTienKH;
        }
        int max = 0;
        for (int i = 0; i < soKhachHang; i++) {
            if (tongTaiSan[i] > max) {
                max = tongTaiSan[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}};
        System.out.println(maximumWealth(a));
    }
}

//Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.