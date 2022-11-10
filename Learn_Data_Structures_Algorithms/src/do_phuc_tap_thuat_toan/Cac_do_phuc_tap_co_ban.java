package do_phuc_tap_thuat_toan;

public class Cac_do_phuc_tap_co_ban {

}
// O(1) :     độ phức tạp hằng số
// O(log n) : độ phức tạp logarit
// O(n) :     độ phức tạp tuyến tính
// O(n^k) :   độ phức tạp đa thức
// O(k^n) :   độ phức tạp hàm mũ

//    // CÁCH XÁC ĐỊNH NGẮN GỌN ĐỘ PHỨC TẠP
//    O(1,2,3..) => O(1)
//    O(log2n, log3n) => log(n)
//    O(n+100,..) => O(n)
//    O(n^k + n^k-1) -> O(n^k)
//    ..
//        quy tắc cộng ->  O(n)
//        quy tắc nhân ->  O(n^2)

// Bé đến lớn -> O(1), O(logn), O(n), O(nlogn), O(n^2), O(2^n), O(n!)

// Xác định độ phức tạp của 1 số thuật toán :
// Tìm kiếm nhị phân : O(log n) -> sắp xếp trước
// Tìm kiếm tuần tự : O(n)
// Sắp xếp nổi bọt  : O(n^2)
// Duyệt ma trận 2 chiều : O(n^2)
// Fibonacci : O(2^n)