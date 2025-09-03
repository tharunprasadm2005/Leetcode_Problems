// Last updated: 03/09/2025, 10:08:38
class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null || q == null)
      return p == q;
    return p.val == q.val &&
           isSameTree(p.left, q.left) &&
           isSameTree(p.right, q.right);
  }
}
