package array_mang;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class check2phantubangtong {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 16;
        int size_arr = arr.length;
        checkPairSumWayThree(arr, size_arr, sum);
    }
    static void checkPairSumWayThree(int[] arr, int size_arr, int sum) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size_arr; i++) {
            int index2 = sum - arr[i];
            if (set.contains(index2) && index2 >= 0) {
                System.out.println(" i = "+ index2 + " và " + "j = " + arr[i]);
            } else {
                set.add(arr[i]);
            }

        }

    }
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 24, 5, 24, 21, 33, 45};
//        int x = 23;
//        System.out.println(check(arr, x));
//    }
//
//    private static boolean check(int[] arr, int x) {
//        Arrays.sort(arr);
//        int l = 0;
//        int r = arr.length-1;
//        while (l<r) {
//            if (arr[l] + arr[r] == x) {
//                return true;
//            } else if (arr[l] + arr[r] > x) {
//                r--;
//            } else {
//                l++;
//            }
//        }
//        return false;
//    }




// c1
//    private static boolean check(int[] arr, int x) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == x) {
//                    return true;
//                    //System.out.println("Tổng = x sẽ là 2 phần tử  tại vị trí index : i = " + i + ", j = " + j + "");
//                }
//            }
//        }
//        return false;
//    }
}


//   Cho một mảng arr[] và một số nguyên X, kiểm tra xem trong mảng có cặp nào có tổng bằng X.