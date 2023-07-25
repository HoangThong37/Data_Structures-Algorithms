package array_mang;

import java.util.*;

public class lay3phantulonnhat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 8, 4, 3, 5, 8, 9, 6, 4, 33, 2, 10};
        //findThreeMax1(arr);
        //findThreeMax2(arr);
        findThreeMax3(arr);
    }

    private static void findThreeMax3(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 1;
        int check = 0;
        for (int i = n - 1; i >= 0; i--) {

            if (count < 4) {
                if (check != arr[i])
                System.out.println("Phần tử lớn thứ " + count + " là : " + arr[i]);
                check = arr[i];
                count++;
            } else {
                break;
            }
        }
    }

    // sử dụng set and arr
    private static void findThreeMax2(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for (int item : arr) {
            set.add(item);
        }
        Integer[] arrInt = set.toArray(new Integer[0]);

        for (int i = arrInt.length - 3; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }

    //

    private static void findThreeMax1(int[] arr) {
        int max1, max2, max3;
        max1 = max2 = max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }
        System.out.println("Phần tử lớn 1 : " + max1);
        System.out.println("Phần tử lớn 2 : " + max2);
        System.out.println("Phần tử lớn 3 : " + max3);
    }
}



