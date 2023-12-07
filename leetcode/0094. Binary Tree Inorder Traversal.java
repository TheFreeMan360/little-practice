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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList();
        inorder(l, root);
        return l;
    }

    private void inorder(List<Integer> lis, TreeNode root) {
        if (root == null)
            return;
        if (root.left != null)
            inorder(lis, root.left);
        lis.add(root.val);
        if (root.right != null)
            inorder(lis, root.right);
    }
}