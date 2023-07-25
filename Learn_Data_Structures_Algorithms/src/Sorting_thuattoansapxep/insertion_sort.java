package Sorting_thuattoansapxep;

public class insertion_sort {


    public static void main(String[] args) {
        int[] a = {12, 13,14, 10, 5, 6};
        insertionSort(a);
        // System.out.println(bubbleSort(LongestWord));
    }

    private static void insertionSort(int[] a) {
        // chạy vòng lặp for từ vị trí thứ 1
        // So sánh phần tử hiện tại vs ptu đứng trc, nếu < thì so sánh tiếp những cái phần tử đứng trc đó nz
        // những ptu lớn hơn ptu hien tại thì cta sẽ di chuyển lên 1 vị trí để tạo khoảng trống cho phần tử hiện tại
        int n = a.length;
//        for (int i = 1; i < n; i++) {
//            int j = i - 1;
//            int check = a[i];
//            while (j >= 0 && a[j] > check) {
//                a[j + 1] = a[j];
//                j--;
//            }
//            a[j+1] = check;
//        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        // tại vì sau mỗi vòng lặp thì phần tử lớn nhất nó sẽ ddc nằm cuối nên ko cần phải xét ptu cuối cùng

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }



}

// insertion_sort = sắp xếp chèn
// -- độ phức tạp : 0(n2)

// Nguyên lí :
//  b1. chạy từ đầu mảng đến cuối mảng
//  b2. Tại vòng lặp i, ta coi dãy [0, i-1] đã sắp xếp, chèn cái phần tử i vào vị trí thích hợp
//  b3. Sau vòng lặp i, thì dãy [0, i] đã sắp xếp
