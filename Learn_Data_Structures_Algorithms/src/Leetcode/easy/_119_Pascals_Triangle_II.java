package Leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class _119_Pascals_Triangle_II {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
            for (int j = i; j >= 0; j--) {
                if (j != i && j != 0) {
                    list.set(j, list.get(j) + list.get(j - 1));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(getRow(n));
    }

}

//       Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
//
//        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:



//        Input: rowIndex = 3
//        Output: [1,3,3,1]

 // 1 -> 0
// 1 1 -> 1
//1 2 1 -> 2
//1 3 3 1 -> 3