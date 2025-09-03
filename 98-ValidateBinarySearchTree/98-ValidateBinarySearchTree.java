// Last updated: 03/09/2025, 10:08:41
class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);        
    }

    private boolean valid(TreeNode node, long minimum, long maximum) {
        if (node == null) return true;

        if (!(node.val > minimum && node.val < maximum)) return false;

        return valid(node.left, minimum, node.val) && valid(node.right, node.val, maximum);
    }    
}