package geeksforgeeks.array;

import java.util.Arrays;

public class Find_the_largest_three_distinct_elements {

// Find the largest three distinct elements in an array
// Tìm ba phần tử khác biệt lớn nhất trong một mảng
//    Input: arr[] = {10, 4, 3, 50, 23, 90}
//    Output: 90, 50, 23

    static void print3largest(int arr[]) {
        int n = arr.length;

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
             else if (arr[i] > max2) {
                max3 = max2;
                max2 = max1;
            }
            else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }

        System.out.println("Max 1 = " + max1 + " , " + "Max 2 = " + max2 + " , " + "Max 3 = " + max3);
    }

    // cách 2
    // dùng arrays.sort -> nó đã sx
    static void print3largest2(int arr[]) {
        int n = arr.length;
        int count = 0; // đếm xem số lượng đã đủ in ra đủ 3 ptu hay k
        int check = 0;

        Arrays.sort(arr);
        for (int i = 1; i <= n; i++) {

            if (count < 3) {
                if (check != arr[n-i]) {
                    System.out.println(arr[n-i] + "");
                    check = arr[n-i];
                    count++;
                }
            } else {
                break;
            }
        }
    }


    public static void main(String[] args) {
        Find_the_largest_three_distinct_elements ob = new Find_the_largest_three_distinct_elements();
        int arr[] = {10, 4, 3, 50, 23, 90};
        ob.print3largest2(arr);
    }
}
