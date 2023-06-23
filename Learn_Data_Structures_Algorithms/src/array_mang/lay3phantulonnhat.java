package array_mang;

import java.util.Arrays;

public class lay3phantulonnhat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 8, 9, 6, 4, 33, 2, 10};
        findThreeMax(arr);
    }

    private static void findThreeMax(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int check = 0;
        int n = arr.length;
            for (int i = 1; i < n; i++) {
                if (count < 4) {
                    if (check != arr[n - i]) {
                        System.out.println(arr[n - i] + " ");
                        check = arr[n - i];
                        count++;
                    }
                } else {
                    break;
                }
            }
      //  }
    }}

//    private static void findThreeMax(int[] arr) {
//        int LongestWord,b,c;
//        LongestWord = b = c = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > LongestWord) {
//                c = b;
//                b = LongestWord;
//                LongestWord = arr[i];
//            }
//            else if (arr[i] > b) {
//                c = b;
//                b = arr[i];
//            }
//            else if (arr[i] > c) {
//                c = arr[i];
//            }
//        }
//        System.out.println("Phần tử lớn nhất là : " + LongestWord);
//        System.out.println("Phần tử lớn t2 là : " + b);
//        System.out.println("Phần tử lớn nhất là : " + c);
//
//
//    }
//

