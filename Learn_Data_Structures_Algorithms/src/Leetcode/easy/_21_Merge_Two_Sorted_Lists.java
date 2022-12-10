package Leetcode.easy;

import Leetcode.medium._2_Add_Two_Numbers;

public class _21_Merge_Two_Sorted_Lists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 =list2;
            list2 =temp;
        }
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    }
}

//Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]