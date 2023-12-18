/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public int deepestLeavesSum(TreeNode root) {
        return sumMaxDepth(root, 1, findMaxDepth(root));
    }
    
    private static int findMaxDepth(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(findMaxDepth(root.left), findMaxDepth(root.right));
    }
    
    private static int sumMaxDepth(TreeNode root, int currDepth ,int targetDepth){
        if(root == null) return 0;
        int sum = (currDepth == targetDepth? root.val: 0)
                + sumMaxDepth(root.left, currDepth + 1, targetDepth)
                + sumMaxDepth(root.right, currDepth + 1, targetDepth);
        return sum;
    }
    
}