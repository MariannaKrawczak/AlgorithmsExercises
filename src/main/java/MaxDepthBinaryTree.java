
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


public class MaxDepthBinaryTree {


  public int maxDepth(TreeNode root) {

    int maxDepth = 0;

    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }

    if (root.left != null) {
      int depthLeft = maxDepth(root.left) +1;
      if (depthLeft> maxDepth) {
        maxDepth = depthLeft;
      }
    }
    if (root.right != null) {
      int depthRight = maxDepth(root.right) +1;
      if (depthRight> maxDepth) {
        maxDepth = depthRight;
      }
    }

    return maxDepth;

  }

}
