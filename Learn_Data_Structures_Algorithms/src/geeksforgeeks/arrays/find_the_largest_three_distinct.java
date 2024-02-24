package geeksforgeeks.arrays;

import java.util.Arrays;

public class find_the_largest_three_distinct {

//    Input: arr[] = {10, 4, 3, 50, 23, 90}
//    Output: 90, 50, 23

    public static void main(String[] args) {

        int arr[] = {10, 4, 3, 50, 23, 90};
        Arrays.sort(arr);
        int check = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (count < 4) {
                if (check != arr[arr.length - i]) {
                    System.out.println("Gia tri lon thu " + count + " la : " + arr[arr.length - i]);
                    check = arr[arr.length - i];
                    count++;
                }
            } else {
                break;
            }
        }
    }

//    public static void main(String[] args) {
//
//        int arr[] = {10, 4, 3, 50, 23, 90};
//        int max1 = 0;
//        int max2 = 0;
//        int max3 = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max1) {
//                max3 = max2;
//                max2 = max1;
//                max1 = arr[i];
//            } else if (arr[i] > max2) {
//                max3 = max2;
//                max2 = arr[i];
//            } else if (arr[i] > max3) {
//                max3 = arr[i];
//            }
//        }
//        System.out.println(Arrays.asList(max1, max2, max3));
//    }
}
