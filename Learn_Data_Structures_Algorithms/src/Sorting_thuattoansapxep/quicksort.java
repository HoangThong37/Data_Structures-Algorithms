package Sorting_thuattoansapxep;

public class quicksort {
    // đổi chỗ
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int height) {
        if (low < height) {
            int pivot = partition(arr, low, height);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, height);
        }
    }

    private static int partition(int[] arr, int low, int height) {
        // chọn vị trí pivot
        int pivot = arr[height]; // vtri cuối
        int i = low - 1;
        for (int j = low; j < height; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, height); // chạy hết r -> đổi chỗ // 12 24 34 .. 56 78 46 -> chuyển 46(heigh) vô .. (34 lúc này là i)

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 56, 24, 78, 75, 11, 23, 46};
        int n = arr.length - 1;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}

// độ phức tạp Onlogn
// chọn pivot
// chia đôi, chia đôi rồi sắp xếp theo pivot
// phần tử nào nhỏ hơn thì qua trái pivot
// phần tử nào lớn hơn thì qua phải pivot
// đệ quy tiếp tục các bước trên

//     Thuật toán hiệu quả (Độ phức tạp thuật toán - O(nlogn)):
//        Sắp xếp vun đống (Heap sort)
//        Sắp xếp trộn (Merge sort)
//        Sắp xếp nhanh (Quick sort)

/*
Phân đoạn không cân bằng: không có phần nào cả, một bài toán con có kích thước n-1 và bài toán kia có kích thước là 0.
Đó là trường hợp xấu nhất xảy ra khi dãy đã cho là dãy đã được sắp xếp và phần tử chốt được chọn là phần tử đầu của dãy
=> độ phức tạp thuật toán sẽ là O(n^2)

Phân đoạn hoàn hảo: phân đoạn luôn thực hiện dưới dạng phân thì đôi, mỗi bài toán con có kích thước là n/2
=> độ phức tạp thuật toán là O(nlogn)

Phân đoạn cân bằng: một bài toán con có kích thước n-k và bài toán kia có kích thước là k => độ phức tạp thuật toán là O(n)*/
