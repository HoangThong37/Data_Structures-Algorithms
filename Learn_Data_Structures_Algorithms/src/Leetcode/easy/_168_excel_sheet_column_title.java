package Leetcode.easy;

//        sse.SSEBlend_SRC_OUTPeer;
// 168. Excel Sheet Column Title
public class _168_excel_sheet_column_title {
   public static String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle((n - 1) / 26) + (char)('A' + ((n-1) % 26));
    }
//    public static String convertToTitle(int n) {
//        if(n <= 0){
//            throw new IllegalArgumentException("Input is not valid!");
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        while(n > 0){
//            n--;
//            char ch = (char) (n % 26 + 'A'); // % chia lấy dư
//            System.out.println(n % 26 + " chia lấy dư");
//            n /= 26;
//            System.out.println(n + " n còn lại ");
//            sb.append(ch);
//        }
//
//        sb.reverse();
//        return sb.toString();
//    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(convertToTitle(n));
    }
}

//A -> 1
//        B -> 2
//        C -> 3
//        ...
//        Z -> 26
//        AA -> 27
//        AB -> 28