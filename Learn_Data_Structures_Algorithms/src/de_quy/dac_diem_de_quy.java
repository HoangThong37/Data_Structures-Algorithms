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

// Thực hành 2 : Implement bài toán tìm số Fibonacci thứ n
//           F(5) = F(4)          +     F(3)
//                =  F(4) + F(3)  +   F(2) + F(1)
//   tiếp tụp vs cây đệ quy như vậy đến hết...

//31. Một số bài toán khác
//- Tính tổng từ 1 đến n : T(n) n + T(n - 1)
//- Tính số mũ
//In giá trị của mảng số nguyên
//Tìm UCLN
//Tìm BỘI SỐ CHUNG NHỎ NHẤT
//THÁP HN

// 37. Nên sử dụng đệ quy khi nào ?
 // - Khi cta cần implement nhanh 1 chức năng nào đó để test hoặc kiểm thử 1 giải pháp mà chưa quan tâm đến hiệu năng
// Khi tài nguyên sd đệ quy tương đương vs pp k sử dụng đệ quy
// Khi đệ quy là cách làm duy nhất