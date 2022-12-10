package test;

public class MyLinkedList {
    Node headNode;
    //
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    //Them node vao dau
    public static Node addHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    //Them node vao duoi
    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode; // last node, last node.next -> null
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode; // gán next cho lastNode = new Node
        }
        return headNode;

    }

    //Them node vao vi tri index
    public static Node addAt(Node headNode, int value, int index) {
        if (index == 0) {
            return addHead(headNode, value);
        } else {
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index) {
                    // Thuc hien add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    //Sap xep theo tang dan tu be den lon
    public void sort() {
        Node current = headNode, index = null;
        int temp;
        if (headNode == null) {
            return;
        }
        else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.value > index.value) {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    //Trộn 2 chuỗi đã sắp xếp từ bé đến lớn vào nhau thành chuỗi mới cũng được sắp xếp từ bé đến lớn
    public Node mergeOtherSortedList(Node A, Node B){
        if (A == null)
            return B;
        if (B == null)
            return A;
        if (A.value < B.value) {
            A.next = mergeOtherSortedList(A.next, B);
            return A;
        } else {
            B.next = mergeOtherSortedList(A, B.next);
            return B;
        }
    }

    public static void printListNode(Node head) {
        if(head == null){
            System.out.println("List rỗng!");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null){
                    System.out.print("->");
                }else{
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(2);


//        n1.next = n2;
//        n2.next = n3;

       printListNode(n1);
       Node newList = addHead(n1, 0);
       Node n = addHead(n1, -1);
       printListNode(newList);
       printListNode(n);
    }
}

