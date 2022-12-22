package array_mang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tong_mang {
//    public static List<Integer> test(int[] nums) {
//        int n = nums.length;
//        List<Integer> list = new ArrayList<>();
//        if (n % 2 == 0) {
//            for (int i = 0; i < n; i+=2) {
//                int sum= nums[i] + nums[i+1];
//                list.add(sum);
//            }
//        }  else {
//            for (int i = 0; i < n-1; i+=2) {
//                int sum= nums[i] + nums[i+1];
//                list.add(sum);
//            }
//            list.add(nums[n-1]);
//        }
//      return list;
//    }
private static int[] tinhTongTungCap(int[] a) {
    int[] kq = new int[a.length/2 + 1];
    for(int i = 0; i < a.length; i+=2) {
        if(i+1 < a.length) {
            kq[i/2] = a[i] + a[i+1];
        }else {
            kq[i/2] = a[i];
        }
    }
    return kq;
}

    public static void main(String[] args) {
        int[] sum = {1, 2, 6, 5, 2, 9, 5, 3, 1};
        //System.out.println(tinhTongTungCap(sum));
        System.out.println(Arrays.toString(tinhTongTungCap(sum)));
    }

}

// Cho input => [1,2,6,5,2,9,5]
// output=> [3,11,11,5] tính tổng từng cặp 1 trong mảng,nếu kh đủ cặp thì giữ nguyên index lẻ