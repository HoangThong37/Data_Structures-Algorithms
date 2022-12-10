/*
package HackerRank.Java;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList arr[] = new ArrayList[n];


        for(int i=0;i<n;i++)
        {
            int size = sc.nextInt();
            arr[i] = new ArrayList();

            for(int j=0;j<size;j++)
            {
                arr[i].add(sc.nextInt());
            }

        }


        int q = sc.nextInt();

        for(int i=0;i<q;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try
            {
                System.out.println(arr[x-1].get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }


        sc.close();
    }


}

*/
/*
    Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature.
           Try to solve this problem using Arraylist.
        You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.
        Take your input from System.in.
        Input Format
        The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer
          denoting number of queries. Each query will consist of two integers  and .
        Constraints
        Each number will fit in signed integer.
        Total number of integers in  lines will not cross .
        Output Format
        In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

        Sample Input
        5
        5 41 77 74 22 44
        1 12
        4 37 34 36 52
        0
        3 20 22 33
        5
        1 3
        3 4
        3 1
        4 3
        5 5
        Sample Output

        74
        52
        37
        ERROR!
        ERROR!*/


