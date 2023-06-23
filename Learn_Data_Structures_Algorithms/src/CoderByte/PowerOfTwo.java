package CoderByte;

public class PowerOfTwo {
    // Nếu là lũy thừa của 2 -> true  vd 8,16
    // Không phải là lũy thừa của 2 -> false 20,21,22..

    // Cách 1
    private static String powerOfTwo(int num) {
        if (num == 1 || num == 0)  return "true";
        int x = num / 2;
        int y = num % 2; // check xem num có chia hết cho 2 khum
        if (y == 1) return "false";

        return powerOfTwo(x);
    }

/*    Các số là luỹ thừa của 2 đều có 1 chữ số 1 trong biểu diễn nhị phân của chúng. Ví dụ số
        1: 000001
        2: 000010
        4: 000100
        8: 001000
        16: 010000
        32: 100000
    Xét số n = 32 ( 100000) và n -1 = 31 (011111) và rõ ràng n&(n-1) = 0. */

    public static String powerOfTwo2(int num) {
        int bitwise = num & (num-1);
        return (num != 0) && (bitwise == 0) ? "true" : "false";
    }


    public static void main(String[] args) {
        String result1 = powerOfTwo2(15);
        System.out.println(result1);
        String result2 = powerOfTwo2(64);
        System.out.println(result2);
    }
}
