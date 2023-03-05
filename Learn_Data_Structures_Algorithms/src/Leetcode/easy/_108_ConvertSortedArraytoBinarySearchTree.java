package Leetcode.easy;

import test.MyLinkedList;

public class _108_ConvertSortedArraytoBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        TreeNode head = helps(nums, 0, nums.length); // mảng, trái, phải
        return head;
    }

    private TreeNode helps(int[] nums, int low, int heigh) {
        if (low > heigh) {
            return null;
        }
        int mid = (low + heigh) / 2;  // key
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helps(nums, low, mid);  // đệ quy trái
        node.right = helps(nums, mid+1, heigh); // đệ quy phải
        return node;
    }

}

//        Một cây tìm kiếm nhị phân (Binary Search Tree – viết tắt là BST) là một cây mà trong đó tất cả các nút đều có các đặc điểm sau:
//        Cây con bên trái của một nút có khóa (key) nhỏ hơn hoặc bằng giá trị khóa của nút cha (của cây con này).
//        Cây con bên phải của một nút có khóa lớn hơn hoặc bằng giá trị khóa của nút cha (của cây con này).