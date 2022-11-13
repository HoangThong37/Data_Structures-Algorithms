package merge_sort;

import java.util.Arrays;

public class _912_Sort_an_Array {
    public static int[] mergeSort(int a[], int L, int R) {
        // chia ra
        if (L > R) return new int[0];
        if (L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }
        // chia ra. chia đôi ra
        int k = (L + R) / 2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k + 1, R);

        // trộn vào : a2 và a1 là các mảng đã sắp xếp
        int n = a1.length + a2.length; // tổng số phần tử
        int[] result = new int[n];

        int i = 0; // chỉ số xủa mảng result
        int i1 = 0;  // ìdex của mảng a1
        int i2 = 0;  // ìdex của mảng a2
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) { // a1 và a2 != rỗng
                if (a1[i1] <= a2[i2]) {
                    // a1 nhỏ hơn
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < a1.length) {
                    // a1 or a2 rỗng
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    // a1 or a2 rỗng
                    result[i] = a1[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        System.out.println(Arrays.toString(mergeSort(nums, 0, nums.length)));
    }
}
//Input: nums = [5,2,3,1]
//        Output: [1,2,3,5]
//        Explanation: After sorting the array,
//        the positions of some numbers are not changed (for example, 2 and 3),
//        while the positions of other numbers are changed (for example, 1 and 5).