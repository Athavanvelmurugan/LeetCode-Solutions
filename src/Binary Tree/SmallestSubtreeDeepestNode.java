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
    HashMap<TreeNode, Integer> heights = new HashMap<TreeNode,Integer>();
    
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
         if(root==null || height(root.right)==height(root.left))return root;
        return subtreeWithAllDeepest(height(root.left)>height(root.right)?root.left:root.right);
    }

      public int height(TreeNode root){
        if(root==null)return 0;
        if(heights.containsKey(root))return heights.get(root);
        heights.put(root,1 + Math.max(height(root.left),height(root.right)));
        return heights.get(root);
    }
}
    
