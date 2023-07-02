package test1;

public class mergesort {
    // thuật toán sx chọn
    // độ phức tạp, hiệu suất của cái thuật toán này nó tốt hơn, 0(nlogn)
    // triển khai
    // b1 : tìm chỉ số nằm giữa mảng - để tách mảng ra làm 2 phần
    // b2. gọi đệ quy hàm mergeSort cho nửa đầu tiên
    // b3. gọi đệ quy hàm mergeSort cho nửa thứ 2
    // b4. cuối cùng ta sẽ merge lại 2 cái mảng đã sx ở các bước trên

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6, 3};

        System.out.println("Mảng ban đầu:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sort1(arr, 0, arr.length - 1);

        System.out.println("\nMảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void sort1(int[] arr, int low, int height) {
        if (low < height) {
            int key = (low + height) / 2;
            sort1(arr, low, key);
            sort1(arr, key + 1, height);
            merge(arr, low, key, height);
        }
    }

    private static void merge(int[] arr, int low, int key, int height) {

        int n1 = key - low + 1; // số lượng mảng ptu bên trái.
        int n2 = height - key;  // số lượng mảng ptu bên phải.

        // tạo 1 cái mảng mới để chứa nhung lượng ptu của l1,r1
        int[] arrLeft = new int[n1];
        int[] arrRight = new int[n2];

        for (int i = 0; i < n1; i++) {
            arrLeft[i] = arr[low + i];
        }

        for (int i = 0; i < n2; i++) {
            arrRight[i] = arr[key + 1 + i];  // thêm phần tử vô mảng mới bên phải
        }

        int i = 0, j = 0;  // chỉ mục ban đầu của 2 mảng con
        int k = low;         // bđ tại vị trí bên trái

        while (i < n1 && j < n2) {
            if (arrLeft[i] < arrRight[j]) {
                arr[k] = arrLeft[i];
                i++;
            } else {
                arr[k] = arrRight[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = arrLeft[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = arrRight[j];
            j++;
            k++;
        }

    }


}
