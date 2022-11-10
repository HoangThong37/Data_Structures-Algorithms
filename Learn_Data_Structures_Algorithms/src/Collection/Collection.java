package Collection;

public class Collection {
}

//*** Java Collection Framework
//        -  Một bộ thư viện với rất nhiều class mạnh mẽ giúp bạn đơn giản hóa các thao tác khi làm việc
//
//  +  Collection Interface : Set, queue, List
//          1. Set : Set (tập hợp) là kiểu dữ liệu mà bên trong nó mỗi phần tử chỉ xuất hiện duy nhất một lần
//          + TreeSet :  là 1 class mà trong đó các phần tử trong set đã được sắp xếp. (thực thi giao diện Set Interface)
//        + HashSet :  là 1 class mà các phần tử được lưu trữ dưới dạng bảng băm (hash table) -> implement Set Interface,
//
//        2. List : List là cái mảng mà trong đó các phần tử được sắp xếp theo một thứ tự xác định.
//        + Một số class thực thi List Interface :
//        -  ArrayList:  là 1 class implement dựa trên mảng có kích thước thay đổi được.
//        -  LinkedList: là một class dạng list hoạt động trên cơ sở của cấu trúc dữ liệu danh sách liên kết đôi (double-linked list)
//        -  Vector: là 1 class lưu trữ như mảng có kích thước thay đổi được,  khá là tương tự với ArrayList, tuy nhiên điểm khác biệt là Vector là synchronized,
//        hay là đồng bộ, có thể hoạt động đa luồng mà không cần gọi synchronize một cách tường minh
//
//        3. Queue : là kiểu dữ liệu nổi tiếng với kiểu vào ra FIFO (first-in-first-out)
//        + Một số class thực thi Queue Interface :
//        - PriorityQueue: là 1 dạng queue mà trong đó các phần tử trong queue sẽ được sắp xếp.
//        - LinkedList: chính là LinkedList mình đã nói ở phần List
//        - ArrayDeque: là 1 dạng deque (queue 2 chiều) được implement dựa trên mảng.
//
//        4. Map Interface
//        - là kiểu dữ liệu cho phép ta quản lý dữ liệu theo dạng cặp key-value
//        - trong đó key là duy nhất và tương ứng với 1 key là một giá trị value
//        + Các class thực thi :
//        - TreeMap: là class thực thi giao diện Map Interface với dạng cây đỏ đen (Red-Black tree) trong đó các key đã được sắp xếp
//        -> Class này cho phép thời gian thêm, sửa, xóa và tìm kiếm 1 phần tử trong Map là tương đương nhau và đều là O(log(n))
//        - HashMap: là class chứa các key được lưu trữ dưới dạng bảng băm, cho phép tìm kiếm nhanh O(1).
//        - Hashtable là một mảng của list. Vị trí của một xô được xác định bằng việc gọi phương thức hashcode()
//        . Hashtable cũng lưu trữ dữ liệu dưới dạng cặp key và value.
//        Nó chứa các key duy nhất.
//        Nó KHÔNG thể có bất kỳ key hoặc giá trị nào là null.
//        Nó được đồng bộ.