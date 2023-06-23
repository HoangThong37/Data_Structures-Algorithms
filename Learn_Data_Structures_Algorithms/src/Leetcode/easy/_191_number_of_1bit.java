package Leetcode.easy;

public class _191_number_of_1bit {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int mask = 1;
        int count = 0;
        for (int i = 0; i < 32; i ++) {
            if ((n & mask) != 0) {
                count++;
            }
            mask = (mask << 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
}
//   & :  Toán tử Và nhị phân sao chép một bit tới kết quả nếu nó tồn tại trong cả hai toán hạng
//  << :  Toán tử dịch trái. Giá trị toán hạng trái được dịch chuyển sang trái bởi số các bit được xác định bởi toán hạng bên phải.
//        Input: n = 00000000000000000000000000001011
//        Output: 3
//        Explanation: The input binary string 00000000000000000000000000001011 has LongestWord total of three '1' bits.