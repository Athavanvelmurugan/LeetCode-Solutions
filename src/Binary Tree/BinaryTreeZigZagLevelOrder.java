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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root==null)return result;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverse =false;
        while(!queue.isEmpty()){
            int levelsize= queue.size();
            List<Integer>list = new LinkedList<>();
            for(int i=0; i<levelsize; i++){
            if(!reverse){
                TreeNode current =queue.pollFirst();
                list.add(current.val);
                if(current.left!=null){
                    queue.addLast(current.left);
                }
                if(current.right!=null){
                    queue.addLast(current.right);
                }
            }else{
                TreeNode current=queue.pollLast();
                list.add(current.val);
                if(current.right!=null){
                    queue.addFirst(current.right);
                }
                if(current.left!=null){
                    queue.addFirst(current.left);
                }
            }
            }
             reverse=!reverse;
        result.add(list);
        }
       return result;
    }
}
