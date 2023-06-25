package test;

import java.util.ArrayList;
import java.util.List;

public class test01 {

        public static String ArrayChallenge(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return "";
            }
            List<String> result = new ArrayList<>();
            preOrderTraversal(strArr, 0, result);

            return String.join(" ", result);
        }

        private static void preOrderTraversal(String[] strArr, int index, List<String> result) {
            if (index >= strArr.length || strArr[index].equals("#")) {
                return;
            }
            result.add(strArr[index]);
            preOrderTraversal(strArr, 2 * index + 1, result);
            preOrderTraversal(strArr, 2 * index + 2, result);
        }

        public static void main(String[] args) {
            String[] strArr = {"5", "2", "6", "1", "9", "#", "8", "#", "#", "#", "#", "#", "4", "#"};
            //String[] strArr1 = {"5", "2", "6", "1", "9"};
            System.out.println(ArrayChallenge(strArr)); // Output: "5 2 1 9 4 6 8"
        }
    }
