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
   public List<List<Integer>> levelOrder(TreeNode node) {
       if(node == null) return new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(node);
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> inter = new ArrayList<>();
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode cursor = queue.poll();
        inter.add(cursor.val);
        if (cursor.left != null)
          queue.add(cursor.left);
        if (cursor.right != null)
          queue.add(cursor.right);
      }
      result.add(inter);
      inter = new ArrayList<>();
    }
    return result;

  }

}