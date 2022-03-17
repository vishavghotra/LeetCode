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
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    Map<TreeNode, TreeNode> map = new HashMap<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    map.put(root, null);

    while (!map.containsKey(p) || !map.containsKey(q)) {
      TreeNode node = queue.poll();
      if (node.left != null) {
        queue.add(node.left);
        map.put(node.left, node);
      }
      if (node.right != null) {
        queue.add(node.right);
        map.put(node.right, node);
      }

    }
    Set<TreeNode> set = new HashSet<>();
    while (p != null) {
      set.add(p);
      p = map.get(p);
    }
    while (!set.contains(q)) {
      q = map.get(q);
    }
    return q;

  }
}