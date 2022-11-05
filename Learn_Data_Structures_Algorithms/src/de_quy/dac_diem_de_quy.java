package de_quy;

public class dac_diem_de_quy {

}

// Đệ quy là : 1 hàm nó gọi lại chính nó
// đặc điểm :

//- khi nào sử dụng đệ quy : khi có xuất hiện cái yếu tố đệ quy có trong bài toán
// quy tắc tính :
//    + 0! = 1
//    + (n + 1)! = n! x (n+1)

//+ 1 bài toán thì nó chỉ áp dụng cái phương pháp đệ quy khi mà đủ 2 yếu tố  :
// - bài toán cơ sở / điều kiện dừng : 0! = 1
// - công thức quy nạp : đưa về bài toán con nhỏ hơn
//  n! = (n-1)! x n