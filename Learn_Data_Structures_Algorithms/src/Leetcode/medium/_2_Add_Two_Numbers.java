package Leetcode.medium;

public class _2_Add_Two_Numbers {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        int sum = 0;

        while (l1 != null || l2 != null || sum > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l1 = l2.next;
            }
            // node tếp theo
            result.next = new ListNode(sum % 10);
            sum = sum / 10;
            result = result.next;
        }
        return head.next;
    }
}
