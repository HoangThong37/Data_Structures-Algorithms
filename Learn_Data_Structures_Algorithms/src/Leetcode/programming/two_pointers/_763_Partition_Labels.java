package Leetcode.programming.two_pointers;

import java.util.LinkedList;
import java.util.List;

public class _763_Partition_Labels {

    public static List<Integer> partitionLabel(String s) {
        List<Integer> res = new LinkedList<>();
        char[] arr = s.toCharArray();
        int[] map = new int[26];
        for(int i = 0; i < arr.length; i++){
            map[arr[i] - 'a'] = i;
        }

        int L = 0;
        int maxLastAppearIndex = 0;

        for(int R = 0; R < arr.length; R++){
            int curLastAppearIndex = map[arr[R] - 'a'];

            maxLastAppearIndex = Math.max(maxLastAppearIndex, curLastAppearIndex);

            if(maxLastAppearIndex == R){
                int len = R - L + 1;
                res.add(len);
                L = R + 1;
            }
        }

        return res;
    }


//    public static List<Integer> partitionLabel(String s) {
//        int n = s.length();
//        List<Integer> result = new ArrayList<>();
//        if (s == null || s.length() == 0) return result;
//
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map.put(s.charAt(i), i);
//        }
//
//        int start = 0; // bd dem
//        int index = 0; // do dai
//
//        for (int i = 0; i < n; i++) {
//            int k = map.get(s.charAt(i));
//            index = Math.max(index, k);
//
//            if (i == index) {
//                result.add(index - start + 1);
//                start = i + 1;
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> partitions = partitionLabel(s);
        System.out.println(partitions);
    }
}


// Input: s = "ababcbaca defegde hijhklij"
//        Output: [9,7,8]
//        Explanation:
//        The partition is "ababcbaca", "defegde", "hijhklij".
//        This is a partition so that each letter appears in at most one part.
//        A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.