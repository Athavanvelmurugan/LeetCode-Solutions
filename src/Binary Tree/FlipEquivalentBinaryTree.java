class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
      if(root1==null && root2==null) return true;
      if(root1==null || root2==null || root1.val!=root2.val) return false;
      boolean firstcheck =flipEquiv(root1.left,root2.left)&&flipEquiv(root1.right,root2.right);
      boolean secondcheck = flipEquiv(root1.left,root2.right)&&flipEquiv(root1.right,root2.left);
      return firstcheck || secondcheck;  
    }
}
