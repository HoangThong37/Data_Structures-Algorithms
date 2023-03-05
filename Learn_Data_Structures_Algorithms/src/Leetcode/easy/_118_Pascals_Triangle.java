package Leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _118_Pascals_Triangle {
//    public  static  List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < numRows; i++) {
//            List<Integer> list = new ArrayList<>();
//            for (int j = 0; j <= i; j++) {
//                if (j == 0) {
//                    list.add(1);
//                } else if (j == i) {
//                    list.add(1);
//                } else {
//                    list.add(result.get(i-1).get(j -1) + result.get(i - 1).get(j));
//                }
//            }
//            result.add(list);
//        }
//        return result;
//    }

    public  static  List<List<Integer>> generate(int numRows) {
        List result = new ArrayList<ArrayList<Integer>>();
        if (numRows <= 0)
            return result;
        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        result.add(pre);
        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1); //first
            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(pre.get(j) + pre.get(j + 1)); //middle
            }
            cur.add(1);//last
            result.add(cur);
            pre = cur;
        }
        return result;
    }

    public static void main(String[] args) {
        int nums = 5;
        System.out.println((generate(nums)).toString());
    }
}

//Input: numRows = 5
//        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]


//        Given an integer numRows, return the first numRows of Pascal's triangle.
//        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

//    1
//   1 1
//  1 2 1
// 1 3 3 1
//1 4 6 4 1