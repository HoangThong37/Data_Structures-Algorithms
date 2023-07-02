package test1;

public class quicksorrt {
    // sx nhanh
    // onlogn

    // chọn phần tử partition đầu mảng, giữa mảng, cuối mảng
    // chia chia, chia đôi để mà sắp xếp theo pivot
    // chúng ta sẽ sx mảng lại theo cái partition đó
    // những gtri < partition thì cho nó về bên trái partio
    // và ngược lại
    // đệ quy nhừng cái bc đó

    public static void main(String[] args) {
        int[] arr = {12, 56, 24, 78, 75, 11, 23, 46};
        int n = arr.length - 1;
        sort1(arr, 0, n);
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void sort1(int[] arr, int low, int height) {
        if (low < height) {
            int key = partition(arr, low, height);
            sort1(arr, low, key - 1);
            sort1(arr, key + 1, height);
        }

    }

    private static int partition(int[] arr, int low, int height) {
        int pivot = arr[height];
        int j = low - 1;

        for (int i = low; i < height; i++) {
            if (arr[i] < pivot) {
                j++;
                swap1(arr, i, j);
            }
        }
        swap1(arr, j+1 ,height);
        return j + 1;
    }

    private static void swap1(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
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

}
