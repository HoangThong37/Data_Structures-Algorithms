package Stack_and_queue;

import java.util.Queue;
import java.util.Stack;

public class Stack_and_Queue {
    // leetcode 20
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();  // tạo 1 cái Stack
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // trả về giá trị Char của chuỗi tại vị trí có chỉ số index được chỉ định được chỉ định
            if (c == '(' || c == '{' || c == '[' ) {
                myStack.push(c);
            }
            else {
                char getElement = myStack.peek(); // lấy dữ liệu
                if (c == ')' && getElement == '('
                        || c == '}' && getElement == '{'
                        || c == ']' && getElement == '[') {
                    myStack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        String  s = "()[]{}";
        System.out.println(isValid(s));
    }


//    Given LongestWord string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has LongestWord corresponding open bracket of the same type.

//    Input: s = "()"
//    Output: true

//    Input: s = "(]"
//    Output: false

}

// queue( hàng đợi ) : Là 1 cấu trúc dữ liệu hoạt động theo nguyên tắc FIFO (Vào trước ra trước) -> BFS
//      ví dụ : như xếp hàng mua vé => vào trước, ra trước


// Stack (Ngăn xếp) : Là 1 cấu trúc dữ liệu hoạt động theo nguyên tắc FILO (Vào sau ra trước).  -> DFS
//      ví dụ : bỏ đồ vào cốc và lấy ra

// Các thao tác chính khi làm việc với Stack và Queue là :
//- push : Thêm ptu vào danh sach
//- pop : Lấy 1 phần tử ra khỏi danh sách(pop)
//- peek : kiểm tra đã đày chưa
//- isEmpty : kiểm tra isEmpty có rỗng k

//+ Queue
// Hoạt động enqueue(): thêm (hay lưu trữ) một phần tử vào trong hàng đợi.
// Hoạt động dequeue(): xóa một phần tử từ hàng đợi.
// Phương thức peek(): lấy phần tử ở đầu hàng đợi, mà không xóa phần tử này.
// Phương thức isFull(): kiểm tra xem hàng đợi là đầy hay không.
// Phương thức isEmpty(): kiểm tra xem hàng đợi là trống hay hay không.

//     STACK :
//        Hoạt động push():    lưu giữ một phần tử trên ngăn xếp.
//        Hoạt động pop():     xóa một phần tử từ ngăn xếp.
//        Hoạt động peek():    lấy phần tử dữ liệu ở trên cùng của ngăn xếp, mà không xóa phần tử này.
//        Hoạt động isFull():  kiểm tra xem ngăn xếp đã đầy hay chưa.
//        Hoạt động isEmpty(): kiểm tra xem ngăn xếp là trống hay không.

// Cài đặt : Arrays -> Sử dụng 1 mảng array để làm buffer cho Stạk và Queue
//                   +  Ưu điểm : dễ implement (cài đặt)
//                   +  Nhược điểm : bộ nhớ bị giới hạn và không tối ưu -> vd khai báo 100 mà dùng 2
//
//           Linked List -> Sử dụng linked list để lưu trữ cho SnQ - sử dụng danh sách liên kết
//                     +  Ưu điểm : Tối ưu về mặt bộ nhớ -> cần dùng cái nào thì khai báo thôi
//                   +  Nhược điểm : implement khó hơn khi sử dụng arrays
//
//
// 71-77
