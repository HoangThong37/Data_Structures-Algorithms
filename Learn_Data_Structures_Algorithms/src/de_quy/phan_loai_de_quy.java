package de_quy;

public class phan_loai_de_quy {
    public static void printElement(int[] arr, int index) {
        // bài toán cơ sở
            if (index < 0 || index > arr.length)
                return;
                // Công thức quy nạp : in phần tử index, print index +1
            System.out.println(arr[index]);
            printElement(arr, index + 1);

    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 5, 63, 5, 63, 6, 7, 22};
        printElement(arr, 0);
    }
}
// Bộ nhớ Stack :
//-- dùng để lưu biến local
//-- con trỏ đến hàm

// +++ Đệ quy có 2 loại :
// Đệ quy thực hiện công việc trước 0 1 3 4 5
// Đệ quy thực hiện công việc sau. 5 4 3 2 1

//++ ưu điêm và nhược điểm :
//1. ƯU điểm
//    - Ngắn gọn, dễ hình dung
//    - Dễ implement
//2. Nhược điểm
//    - Nếu xử lí k đúng dễ gây StackOverFlow
//    - Tốn hiệu năng về mặt thời gian và không gian bộ nhớ

