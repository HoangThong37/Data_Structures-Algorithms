package merge_sort;

public class li_thuyet {
}
//  Sắp xếp trộn => 1 trong 2 phổ biến tối ưu hơn
//  ý tưởng  : chia đôi ra -> trộn vào (vừa trộn vừa sắp xếp)
//       1 5 3 2 8 7 6 4 => chia ra thành 2 phần rồi chia hết ra đến lúc thành 1 phần tử
// => chúng ta coi mảng 1 phần tử là mảng đã sắp xếp
// => trộn 2 mảng đã sắp xếp với nhau
//  1     5     3     2       8       7      6      4
//=> 1 vs 5 ->  1 5
//-> 3 với 2 -> 2 3
// => trộn 2 mảng trên lại vs nhau


//-> 8 với 7 -> 7 8
//-> 6 với 4 -> 4 6
// => trộn 2 mảng trên lại vs nhau

//=> trộn mảng cuối cùng là xong

//   Độ phức tạp thời gian trong trường hợp xấu nhất, tốt nhất, trung bình của Merge Sort đều là O(nlogn), điều này làm cho Merge Sort tỏ ra khá hiệu quả.
//   Merge sort là một lựa chọn khi cần một thuật toán để sắp xếp có tính ổn định, khác với quick sort, không ổn định cho lắm.
//    Nhược điểm của merge sort có thể kể đến như không hiệu quả lắm về mặt không gian, khi độ phức tạp không gian trong trường hợp xấu nhất là O(n)
//    trong khi của quick sort là O(1)