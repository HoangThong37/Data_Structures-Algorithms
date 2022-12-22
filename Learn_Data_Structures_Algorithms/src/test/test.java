package test;

import java.util.HashSet;
import java.util.Set;

public class test {
    public static void themVao(int max[], int value) {
        int vt = -1;
        for (int i = 0; i < max.length; i++) { // Vd: 7 5 2 them 6
            if (value > max[i]) { // tim vi tri i chen value
                vt = i;
                break;
            } else if (value == max[i]) {// Neu da co value thi thoi
                return;
            }
        }
        if (vt != -1) {// Bat dau qua trinh chen value vao vi tri i
            for (int i = max.length - 2; i >= vt; i--) {
                max[i + 1] = max[i];
            }
            max[vt] = value;
        }

    }

    public static int timMaxThu3_Cach1(int[] a) {
        int[] max = new int[3];
        for (int i = 0; i < a.length; i++) {
            themVao(max, a[i]);
        }
        return max[3 - 1];
    }

    public static void main(String[] args) {
        int[] n = {1,2,4,3,7, 8 ,6,6 ,4,5,4,5};
        System.out.println(timMaxThu3_Cach1(n));
    }
}
