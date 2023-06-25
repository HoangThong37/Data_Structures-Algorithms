package test;

public class merge_sort {

// ý tương thuật toán

// mergeSort(arr[], l,  r)
// if r > l
//      1. Tìm chỉ số nằm giữa mảng để chia mảng thành 2 nửa:
//              middle m = (l+r)/2
//      2. Gọi đệ quy hàm mergeSort cho nửa đầu tiên:
//              mergeSort(arr, l, m)
//      3. Gọi đệ quy hàm mergeSort cho nửa thứ hai:
//              mergeSort(arr, m+1, r)
//      4. Gộp 2 nửa mảng đã sắp xếp ở (2) và (3):
//              merge(arr, 1, m, r)

    void sort(int[] arr, int l, int r) {
        if (l < r) {
            // chia tách nó ra
            int key = (r+l)/2;
            sort(arr, l, key); // call đệ quy với mảng bên trái
            sort(arr, key+1, r); // call đệ quy với mảng bên phải

            merge(arr, l, key, r);
        }
    }

    private void merge(int[] arr, int l, int key, int r) {
        int n1 = key - l + 1; // tìm kích thước của 2 mảng con để merge
        int n2 = r - key;

        int[] L = new int[n1]; // mảng có n1 ptu đang rỗng
        int[] R = new int[n2]; // mảng có n2 ptu đang rỗng

        // thêm data vào 2 mảng
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i]; // lấy cả key
        }

        for (int i = 0; i < n2; i++) {
            R[i] = arr[key + i + 1]; // từ vị trí tiếp theo của key
        }

        // merge các mảng tạm lại
        int i = 0, j = 0; // chỉ mục ban đầu của 2 mảng con
        int k = l; // bắt đầu bên trái

        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // check xem còn xót bên L ko
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // check xem còn xót bên R ko
        while (j < n2) {
            arr[k] = L[j];
            j++;
            k++;
        }

    }
}
