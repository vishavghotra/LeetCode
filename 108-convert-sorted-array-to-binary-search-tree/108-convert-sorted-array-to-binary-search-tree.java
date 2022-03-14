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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==1)
            return new TreeNode(nums[0]);
        else {
         
         TreeNode node= insert(nums,0,nums.length-1);
            return node;
        }
    }
    
    public TreeNode insert(int[] nums,int start,int end){
        if(start>end)
            return null;
     
     else{
            int middle=(end+start)/2;
            
            TreeNode node=new TreeNode(nums[middle]);
            node.left=  insert(nums,start,middle-1);
            node.right= insert(nums,middle+1,end);
         
            return node;
     }   
        
            
        
    }
}