package test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Integer n = 5;
        String test = n!=5 ? String.valueOf(n instanceof Integer ? Integer.MAX_VALUE : Double.MAX_VALUE) : n.toString();
        System.out.println(test);

    //    if(n == 5)

    }
}
