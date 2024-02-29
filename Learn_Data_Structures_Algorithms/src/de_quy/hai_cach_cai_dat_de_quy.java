package de_quy;

public class hai_cach_cai_dat_de_quy {
    private static int currentMax = -1;
    public static void findMax(int[] arr, int i) { // điều kiện dừng chính là chỉ số i
          // function trả về void nên cta cần có 1 cái biến để lưu kết quả tim đc
         //  xét điều kiện dừng
        if (i < arr.length) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
            findMax(arr, i +  1);
        }
    }
    // trả về kết quả
    public static int findMax2(int[] arr, int i, int previousMax) {
        if (i < arr.length) {
            int currentMax = Math.max(previousMax, arr[i]);
            return findMax2(arr, i + 1, currentMax);
        }
        return previousMax;

    }
    public static void main(String[] args) {
        currentMax = -1;
        int[] arr = {1,2,3,4,67,44,32,111,435,77,2,33};
        findMax(arr, 0);
        System.out.println("aa" + currentMax);

        System.out.println(findMax2(arr, 0, -1));
    }

}
// Phân loại :
// +  Ko trả về kết quả
//     -> áp dụng cho hầu hết các bài toán (nếu có sử dụng đệ quy)
//     -> những bài toán lưu kết  quả
//  + Có trả về kq
//      -> khi làm việc vs CTDL có tính đệ quy (linked list, tree)
//      -> ngắn gọn, sạch sẽ, dễ hiểu
// + Bài toán : Tìm max cho 1 mảng


