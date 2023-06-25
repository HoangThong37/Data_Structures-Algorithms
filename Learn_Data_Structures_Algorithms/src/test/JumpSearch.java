package test;

public class JumpSearch {
    // tìm kiếm nhảy
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.sqrt(n); // Kích thước bước nhảy

        int prev = 0;
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1; // Vượt quá kích thước mảng, không tìm thấy
            }
        }

        // Thực hiện tìm kiếm tuần tự trong vùng chứa giá trị cần tìm
        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1; // Đã duyệt hết vùng nhảy mà không tìm thấy
            }
        }

        // Nếu phần tử được tìm thấy
        if (arr[prev] == x) {
            return prev;
        }

        return -1; // Không tìm thấy phần tử trong mảng
    }

    // Hàm kiểm tra code
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int x = 23;

        int result = jumpSearch(arr, x);

        if (result == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {
            System.out.println("Phần tử được tìm thấy tại vị trí " + result);
        }
    }
}
