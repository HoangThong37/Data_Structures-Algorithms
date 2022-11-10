package do_phuc_tap_thuat_toan;

public class bigO_notation {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int t = 2*i;
            System.out.println(" 2 x " + i + " = " + t);
        }
    }
}
// đ/n :
//- Độ phức tạp(về thời gian) : Là tổng thời gian/ số phép tính toán mà chương trình cần để thực thi chương trình
//
//        i = 0 -> 1
//        i < 10  -> 10
//        i++ -> 10
//        2*i : 10
//        t = : 10
//        print : 4lan .10 = 40 (3 phép cộng, 1 phép in)
//    => sum 81 = 8.10 +1
//       hoặc đặt 10 = n => số phép tính 8.n+1

//+ g(n) được gọi là O của f(n) nếu tồn tại C (> 0, ko phụ thuộc vào n) và n0 sao cho n > n0, ta luôn có
//               f(n) <= C.g(n)
//                             g(n) => là O(n)

// ví dụ : f(n) = 8*n + 1
//        g(n) = n
//        C = 9
//        n0 = 1
// Với mọi n>n0 ta luôn có  : C.g(n) >= f(n)
//        Với mọi n > n0 ta luôn có  : C.g(n) >= f(n)
//        Với mọi n > 1 ta luôn có  : 9n >= 8n + 1

//              ====>>>>>>>>>>  độ phức tạp là O(n) <<<<<<<<<<========

