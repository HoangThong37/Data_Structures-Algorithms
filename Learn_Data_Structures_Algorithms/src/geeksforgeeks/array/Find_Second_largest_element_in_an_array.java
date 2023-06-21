package geeksforgeeks.array;

import java.util.*;

public class Find_Second_largest_element_in_an_array {

    // giải qyết theo 3 cách Array.sort / set / value1,value2

    // Given an array of integers, our task is to write a program
    // that efficiently finds the second-largest element present in the array.

/*    static void print2largest(int arr[]) {
        int n = arr.length;

        Arrays.sort(arr);

        if (n < 2) {
            System.out.println("Invalid input ");
            return;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[n - 1] != arr[i]) {
                System.out.println("Phần tử lớn thứ 2 đó là : " + arr[i]);
                return;
            }
        }
        System.out.println("Mảng ko có phần tử lớn thứ 2 đó");
    }
*/

    static void print2largest1(int arr[]) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("Invalid input");
            return;
        }
        int first, second;
        first = second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("Không có ptu lớn thứ 2 nào");
            return;
        } else {
            System.out.println(second);
        }

       // System.out.println("Phần tử lớn thứ 2 là : " + result.get(result.size() - 2));
    }

//    static void print2largest2(int arr[]) {
//        int n = arr.length;
//        if (n < 2) {
//            System.out.println("Invalid input");
//            return;
//        }
//        // Arrays.sort(arr);
//        List<Integer> result = new ArrayList<>();
//            Set<Integer> setArr = new HashSet<>();
//            for (int i = 0; i < n; i++) {
//                setArr.add(arr[i]);
//            }
//            // setArr
//            for (int item : setArr) {
//                result.add(item);
//        System.out.println("Phần tử lớn thứ 2 là : " + result.get(result.size() - 2));
//    }

    public static void main(String[] args) {
        // int arr[] = {12, 35, 1, 10, 34, 1};
         int  arr[] = {10, 5, 10};
        // int  arr[] = {10, 10, 10};
        // int  arr[] = {10};
        //print2largest(arr);
        print2largest1(arr);
        //System.out.println(print2largest());

    }
}
