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
    public List<Integer> rightSideView(TreeNode root) {
         if (root == null)
      return new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    List<Integer> result = new LinkedList<>();
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode pulled = queue.poll();

        if (i == size - 1) {
          result.add(pulled.val);

        }
        if (pulled.left != null)
          queue.add(pulled.left);
        if (pulled.right != null)
          queue.add(pulled.right);
      }

    }
    return result;
    }
}