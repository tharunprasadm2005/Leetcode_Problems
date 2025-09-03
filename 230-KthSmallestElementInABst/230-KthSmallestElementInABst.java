// Last updated: 03/09/2025, 10:07:57
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int count = 0; 

    public int kthSmallest(TreeNode root, int k) {
        TreeNode result = helper(root, k);
        return result != null ? result.val : 0; 
    }

    private TreeNode helper(TreeNode root, int k) {
        if (root == null) return null;
        TreeNode left = helper(root.left, k);
        if (left != null) return left; 

        count++; 
        if (count == k) return root; 
        return helper(root.right, k);
    }
}