// Last updated: 03/09/2025, 10:08:28
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        helper(root);
        return root;
    }
    public void helper(Node node){
        if(node == null || node.left == null) return;
        node.left.next = node.right;
        if(node.next != null) node.right.next = node.next.left;
        helper(node.left);
        helper(node.right);
    }
}