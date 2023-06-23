package Stack_and_queue;

public class Hai {
    static int solution(int index) {

        if (index <= 2) {
            return 1;
        }
        return (solution(index - 1) + solution(index - 2)) % 10;

    }

    public static void main(String[] args) {
        System.out.println(solution(21));
    }
}
// 253 -> 3
// 253 : 10 = 25 dư 3

// tìm cái fibonacci cho số đó
// sau rồi laasy phần đơn vị

//    Fibonacci sequence are the numbers in the following integer sequence: 1, 1, 2, 3, 5, 8, 13...
//        Write LongestWord method that takes the index as an argument and returns last digit from fibonacci number.
//
//        Example:
//        solution(10) - 55. Your method must return 5 because the last digit of 55 is 5