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
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left, root.right, true);
        return root;
    }

    private void helper(TreeNode left, TreeNode right, boolean isOdd){
        if(left == right) return;

        if(isOdd){
            int tmp = left.val;
            left.val = right.val;
            right.val = tmp;
        }

        helper(left.left, right.right, !isOdd);
        helper(left.right, right.left, !isOdd);
    }
}