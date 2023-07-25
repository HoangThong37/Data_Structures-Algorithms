package Leetcode.easy;

import java.util.LinkedList;

public class _225_Implement_Stack_using_Queues {

    class MyStack {

        public LinkedList<Integer> q1;

        public MyStack() {
             q1 = new LinkedList<>();
        }

        // stack : lifo -> vào trước ra sau
        public void push(int x) {
             q1.add(x);
             int n = q1.size();
             while (n > 1) {
                 q1.add(q1.remove());
                 n--;
             }
        }

        public int pop() {

            return q1.pop();
        }

        public int top() { // get

            return q1.peek();
        }

        public boolean empty() {

            return q1.isEmpty();
        }
    }

}
