package array_mang;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Map;

public class timSoLonThu2 {
    // tìm xem số lớn thứ 2 là số nào
    // c1 : sắp xếp theo thứ tự rồi check - sắp xếp
 /*   public static void sort(int[] nums) {
        if (nums.length < 2) {
            System.out.println("Không tồn tại");
            return;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[i-1]) {
                System.out.println("Gía trị lớn thứ 2 là : " + nums[i-1]);
                return;
            }
        }
        System.out.println("Không có phần tử lớn thứ 2");
        // 3 3 4 5 5
        // Độ phức tạp của phương pháp này: Time Complexity: O(n log n).
    }*/

    //c2. duyệt mảng 1 lần
/*    public static void sort(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        if (nums.length < 2) {
            System.out.println("Không tồn tại");
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
               second = first;
               first = nums[i];
            }
            if (nums[i] < first && nums[i] > second) {
                second = nums[i];
            }
        }
        System.out.println("Phần tử lớn thứ 2 là : " + second);
    }*/

    //c3. duyệt mảng 2 lần
    public static void sort(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        if (nums.length < 2) {
            System.out.println("Không tồn tại");
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            first = Math.max(first, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != first) {
                second = Math.max(second, nums[i]);
            }
        }
        System.out.println("Số lớn thứ 2 là : " + second);

    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,5,6};
        sort(nums);
    }
}
