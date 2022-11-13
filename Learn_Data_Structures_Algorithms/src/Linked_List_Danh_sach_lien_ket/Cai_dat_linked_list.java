package Linked_List_Danh_sach_lien_ket;

public class Cai_dat_linked_list {
    public static class Node {
        int value; // gtri node
        Node next;
        Node(int value) {  // hàm tạo nhận value để gán
            this.value = value;
        }
    }
    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is Empty");
        }
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }
    public static Node addToHead(Node headNode, int val) {
        Node newNode = new Node(val);
        if (headNode == null) {
            return newNode;
        }
        else {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        printLinkedList(node1);
       // Node newList = addToHead(node1, -1);
        printLinkedList(addToHead(node1, -1));
//        printLinkedList(node2);
//        printLinkedList(node3);
    }
}
// 59-61