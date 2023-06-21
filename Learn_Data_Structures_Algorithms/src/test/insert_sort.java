package test;

public class insert_sort {
    // sắp xếp mảng theo thứ tự bé -> lớn
    // thuật toán sắp xếp chèn
    // bđ từ vị trí 1
    // so sánh ptu hiện tại với những ptu truoc
    // nếu ptu chính < ptu trước của nó, hãy so sánh nó với các ptu trc đó.
    // di chuyển những ptu lớn hơn lên 1 vị trí để tạo khoảng trống cho ptu bị hoán đổi

    void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j-1;
            }
            arr[j + 1] = key;
            // 25 25 10

        }
    }
    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        insert_sort ob = new insert_sort();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }



}
