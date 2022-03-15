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
 public List<List<Integer>> pathSum(TreeNode root, int sum) {
    if (root == null)
      return new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, root, sum, new ArrayList<>());
    return result;

  }

  public void backtrack(List<List<Integer>> result, TreeNode root, int sum, List<Integer> inter) {
    if (root == null)
      return;
    sum -= root.val;
    inter.add(root.val);
    if (sum == 0 && root.left == null && root.right == null) {
      result.add(new ArrayList<>(inter));
      return;
    }
    if (root.left != null) {
      backtrack(result, root.left, sum, inter);
      inter.remove(inter.size() - 1);
    }
    if (root.right != null) {
      backtrack(result, root.right, sum, inter);
      inter.remove(inter.size() - 1);

    }
  }
}