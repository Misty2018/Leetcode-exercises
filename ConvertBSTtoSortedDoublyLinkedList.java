package Facebook_Leetcode;


// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

public class ConvertBSTtoSortedDoublyLinkedList {
    private Node pre = null;
    private Node head = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;

        inorder(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        if (pre == null) {
            head = root;
        }else {
            pre.right = root;
            root.left = pre;
        }

        pre = root;

        inorder(root.right);
    }
}
