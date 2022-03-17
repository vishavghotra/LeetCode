/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

  public String serialize(TreeNode root) {
    StringBuilder result = new StringBuilder();
    serial(root, result);
    return result.toString();

  }

  public void serial(TreeNode root, StringBuilder result) {
    if (root == null) {
      result.append("#"+",");
      return;
    }
    result.append(root.val + ",");
    serial(root.left, result);
    serial(root.right, result);

  }

  public TreeNode deserialize(String data) {
    return deserial(new LinkedList<>(Arrays.asList(data.split(","))), new TreeNode(0));

  }

  public TreeNode deserial(Queue<String> queue, TreeNode root) {
    String value = queue.poll();
    if (value.equals("#"))
      return null;
    root.val = Integer.parseInt(value);
    root.left = deserial(queue, new TreeNode());
    root.right = deserial(queue, new TreeNode());
    return root;
  }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));