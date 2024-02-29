package Leetcode.programming.two_pointers;

public class _82_Remove_Duplicates_from_Sorted_List_II  {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode listNode = new ListNode();
        listNode.next = head;

        ListNode prev = listNode;
        ListNode current = head;

        while (current != null) {
            if (current.next != null && current.val == current.next.val) {
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return listNode.next;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        int[] head = {1,2,3,3,4,4,5};
       // deleteDuplicates(head);
    }
}

//  Input: head = [1,2,3,3,4,4,5]
//  Output: [1,2,5]