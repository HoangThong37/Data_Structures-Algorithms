package CoderByte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Find_Intersection {

    public static String FindIntersection(String[] strArr) {
        // 1 mảng 2 ptu - ptu deu la chuoi -> tách = dau phay
        // check xem có trùng các ptu hay ko
        // neu trung thi return cac ptu
        // neu ko thi return false
        String[] arr1 = strArr[0].trim().split(","); //  ['1', '3', '4', '7', '13']
        String[] arr2 = strArr[1].trim().split(","); //  ['1', '2', '4', '13', '15']

        List<String> result = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    result.add(arr1[i]);
                }
            }
        }
        if (!result.isEmpty()) {
            Arrays.sort(result.toArray());
            return result.toString();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        String[] strArr = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        FindIntersection(strArr);
    }
}
