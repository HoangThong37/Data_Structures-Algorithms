package array_mang;

import java.util.HashMap;
import java.util.Map;

public class twosumngu {

    //  int arr[] = {1,2,3,4,9,4,2,8,5} , sum = 13.
    public static void main(String[] args) {
        int arr[] = {1,2,3,9,4,2,8,5};
        int sum = 13;
        sumTwo(arr, sum);
    }

    private static void sumTwo(int[] arr, int sum) {
        Map<Integer, Integer> res = new HashMap<>();
        int[] arrTwo = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (res.containsKey(temp)) {
                arrTwo[0] = res.get(temp);
                arrTwo[1] = i;
                System.out.println("arr1 : " + arr[arrTwo[0]]);
                System.out.println("arr2 : " + arr[arrTwo[1]]);
            } else {
                res.put(arr[i], i); // 1 2 3 9
            }
        }
    }

    // cách 1 : sử dụng 2 vòng lặp
//    private static void sumTwo(int[] arr, int sum) {
//        int n = arr.length;
//        int[] res = new int[2];
//
//        // 2 vòng lặp
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    res[0] = arr[i];
//                    res[1] = arr[j];
//                    System.out.println("Số thứ nhất : " + res[0]);
//                    System.out.println("Số thứ hai : " + res[1]);
//                }
//            }
//        }
//    }
}
