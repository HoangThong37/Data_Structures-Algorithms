package geeksforgeeks.array;

import java.util.Arrays;

public class Count_th_number_of_possible_triangles {

    // Cho một mảng các số nguyên dương chưa sắp xếp, hãy tìm số tam giác có thể được
    // tạo thành với ba phần tử mảng khác nhau là ba cạnh của tam giác. Để có thể tạo thành
    // một tam giác từ 3 giá trị, tổng của bất
    // kỳ giá trị nào trong hai giá trị (hoặc cạnh) phải lớn hơn giá trị thứ ba (hoặc cạnh thứ ba).

    public static void main(String[] args) {
        int[] arr = {4,6,3,7};
        find3Number(arr);

    }

    private static int find3Number(int[] arr) {
        Arrays.sort(arr); // sắp xếp mảng
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

        return count;
    }

}
