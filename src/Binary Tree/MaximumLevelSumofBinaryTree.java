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
    List<Integer> levelSum = new ArrayList<>();

    public int maxLevelSum(TreeNode root) {
        dfs(root, 0);

        int maxSum = Integer.MIN_VALUE;
        int level = 0;

        for (int i = 0; i < levelSum.size(); i++) {
            if (levelSum.get(i) > maxSum) {
                maxSum = levelSum.get(i);
                level = i + 1; 
            }
        }
        return level;
    }

    void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (level == levelSum.size()) {
            levelSum.add(node.val);
        } else {
            levelSum.set(level, levelSum.get(level) + node.val);
        }

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}
