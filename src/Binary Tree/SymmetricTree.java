class Solution {
    public boolean isSymmetric(TreeNode root) {
       Queue<TreeNode>queue = new LinkedList<>();
       Queue<TreeNode>queue2 = new LinkedList<>();
       queue.add(root.left);
       queue2.add(root.right);

       while(!queue.isEmpty() && !queue2.isEmpty()){
        TreeNode left = queue.poll();
        TreeNode right =queue2.poll();

        if(left==null && right==null){
            continue;
        }

        if(left==null || right==null){
            return false;
        }

        if(left.val!=right.val){
            return false;
        }

        queue.add(left.left);
        queue.add(left.right);
        queue2.add(right.right);
        queue2.add(right.left);
       }
       return true;
    }
}
