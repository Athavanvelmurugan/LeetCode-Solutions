class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        int sum=0;
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left!=null){
                if(node.left.left==null && node.left.right==null){
                    sum+=node.left.val;
                }else{
                    queue.add(node.left);
                }
            }

            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return sum;
    }
}
