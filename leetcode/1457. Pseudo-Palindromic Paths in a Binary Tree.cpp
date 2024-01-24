/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    int pseudoPalindromicPaths(TreeNode* root, int count = 0) {
        if (root == nullptr)
            return 0;

        count ^= 1 << root->val;

        if (root->left == root->right)
            return ((count & (count - 1)) == 0) ? 1 : 0;

        return pseudoPalindromicPaths(root->left, count) +
               pseudoPalindromicPaths(root->right, count);
    }
};