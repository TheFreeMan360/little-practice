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
    public String tree2str(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        tree2strhelper(root, sb);
        return sb.toString();
    }

    private void tree2strhelper(TreeNode root, StringBuffer sb) {
        if (root == null)
            return;

        sb.append(root.val);

        //無子樹
        if (root.left == root.right)
            return;

        //有子樹
        sb.append("(");
        tree2strhelper(root.left, sb);
        sb.append(")");

        if (root.right != null) {
            sb.append("(");
            tree2strhelper(root.right, sb);
            sb.append(")");
        }
    }

}