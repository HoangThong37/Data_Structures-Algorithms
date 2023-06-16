package Sorting_thuattoansapxep.testtt;

import java.util.Stack;

public class daonguocstring {
    public static void main(String[] args) {
        String abc = "thong dep zai";

          int n = abc.length();
//        String result = "";
//        for (int i = n-1; i >= 0; i--) {
//            result = result + abc.charAt(i);
//        }

//        System.out.println(result);
//
//        byte[] bytes = abc.getBytes();
//        byte[] result = new byte[bytes.length];
//
//        for (int i = 0; i < bytes.length; i++) {
//            result[i] = bytes[bytes.length - i - 1];
//        }
//
//        System.out.println(new String(result));

//        StringBuilder stringBuilder = new StringBuilder(abc);
//        System.out.println(stringBuilder.reverse());

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(abc.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
