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
    int order = 0;
    int value = 0;
 public int kthSmallest(TreeNode root, int k) {
if(root == null) {
  return 0;


}
 smallest(root, k);

return value;

 }

 public void smallest(TreeNode root, int k) {
     
if(root.left != null)  {
smallest(root.left, k);

}
     order++;
if(order == k) {
  value = root.val;
  
    return;
}

if(root.right != null) {
  smallest(root.right, k);
}






 }
}