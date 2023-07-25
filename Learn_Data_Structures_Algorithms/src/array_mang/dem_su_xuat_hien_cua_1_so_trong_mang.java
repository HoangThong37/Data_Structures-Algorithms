package array_mang;

import java.util.HashMap;
import java.util.Map;

public class dem_su_xuat_hien_cua_1_so_trong_mang {


    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5,6,3,2,1,1,2,3,4};
        countNumberInArray(arr);
    }

    private static void countNumberInArray(int[] arr) {

        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!res.containsKey(arr[i])) {
                res.put(arr[i], 1);
            } else {
                res.put(arr[i], res.get(arr[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            System.out.println("Number " + number + " count " + count + " lần");
        }
    }

/*    private static void countNumberInArray(int[] arr) {
        Arrays.sort(arr);

        int index = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == index) {
                count++;
            } else {
                System.out.println("Number : " + index + " - count : " + count);
                index = arr[i];
                count = 1;
            }
        }
        System.out.println("Number : " + index + " - count : " + count);
    }*/
}
