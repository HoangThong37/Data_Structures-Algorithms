package Stack_and_queue;

import java.util.Stack;

public class Stack_and_Queue {
    public boolean isValid(String s) {
        // stack
        // Given a string s containing just
        // the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid
        Stack<Character> myCharacter = new Stack<>(); // tạo character
        for (int i = 0; i < s.length(); i++) { // duyệt các phần tư
            char c = s.charAt(i); // charAt nó trả về chỉ số index
            if (c == '(' || c == '{' || c == '[' ) {
                myCharacter.push(c);
            }
            else  {
                if (myCharacter.isEmpty()) return false;
                char openStack = myCharacter.peek();
                if (c==')' && openStack=='('
                        || c=='}' && openStack=='{'
                        || c==']' && openStack=='[') {
                    myCharacter.pop(); // nếu mà là cặp thì xóa
                }
                else {
                    return false;
                }
            }
        }
        return myCharacter.isEmpty();
    }




}

// queue( hàng đợi ) : Là 1 cấu trúc dữ liệu hoạt động theo nguyên tắc FIFO (Vào trước ra trước) -> BFS
//      ví dụ : như xếp hàng mua vé => vào trước, ra trước


// Stack (Ngăn xếp) : Là 1 cấu trúc dữ liệu hoạt động theo nguyên tắc FILO (Vào sau ra trước).  -> DFS
//      ví dụ : bỏ đồ vào cốc và lấy ra

// Các thao tác chính khi làm việc với Stack và Queue là :
//- push : Thêm ptu vào
//- pop : Lấy ra 1 phần tử
//- peek : kiểm tra đã đày chưa
//- isEmpty : kiểm tra isEmpty có rỗng k

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
