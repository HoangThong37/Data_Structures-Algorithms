package array_mang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class timptutheoTong {
    // cách 1
    public static int[] timCapSo(int[] arr, int sum) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    System.out.println(arr[i] + " - " + arr[j]);
                }
            }
        }
        return arr;
    }
    // cách 2


    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 3, 0, -1};
        int sum = 5;
        // System.out.println(timCapSo(nums, sum));
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value)) { // xuất hiện r
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(sum - arr[i]) != null
                    && map.get(sum - arr[i]) >= 1
                    && map.get(arr[i]) >= 1) {
                System.out.println(arr[i] + " - " + (sum - arr[i]));
                 map.put(sum - arr[i], map.get(sum - arr[i]) - 1);
                 map.put(arr[i], map.get(arr[i]) - 1);
            }
        }


    }
}


// input : [2, 3,4,6,1,5]
// output : 4 _ 6