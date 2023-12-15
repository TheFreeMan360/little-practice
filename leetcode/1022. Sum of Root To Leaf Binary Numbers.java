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
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int sumOfparent){
        if(root == null) return sumOfparent; 
        
        int tmp = sumOfparent * 2 + root.val;
        if(root.left == root.right) return tmp;
        int ans = (root.left == null)? 0 : helper(root.left, tmp);
            ans += (root.right == null)? 0 : helper(root.right, tmp);
        return ans;
    }
}