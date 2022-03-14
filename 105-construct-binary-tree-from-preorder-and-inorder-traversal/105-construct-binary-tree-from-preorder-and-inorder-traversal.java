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
class Solution {
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder.length == 1) {
      return new TreeNode(preorder[0]);
    } else if (preorder.length == 0) {
      return null;
    } else {
      return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

  }

  public TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
      if(preStart > preEnd || inStart > inEnd)
          return null;
    int i = 0;
    for (i = inStart; i <= inEnd; i++) {
      if (inorder[i] == preorder[preStart]) {
        break;
      }
    }
    int leftLength = i - inStart;
    TreeNode result = new TreeNode(inorder[i]);
    result.left = build(preorder, inorder, preStart + 1, preStart + leftLength, inStart, i - 1);
    result.right = build(preorder, inorder, preStart + leftLength + 1, preEnd, i + 1, inEnd);
    return result;
  }
}