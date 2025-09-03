// Last updated: 03/09/2025, 10:08:00
class Solution {
  public int countNodes(TreeNode root) {
    if (root == null)
      return 0;
    return 1 + countNodes(root.left) + countNodes(root.right);
  }
}