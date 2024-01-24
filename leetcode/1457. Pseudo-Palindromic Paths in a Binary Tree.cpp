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
    int pseudoPalindromicPaths(TreeNode* root) {
        return dfs(root, true, bitset<10>());
    }

    int dfs(TreeNode* root, bool isOddLevel, bitset<10> s) {
        if (root == nullptr) {
            return 0;
        }

        if (root->left == root->right) {
            s.flip(root->val);
            bool cond1 = isOddLevel && s.count() == 1;
            bool cond2 = !isOddLevel && s.count() == 0;
            return (cond1 || cond2) ? 1 : 0;
        }

        s.flip(root->val);
        return dfs(root->left, !isOddLevel, s) + dfs(root->right, !isOddLevel, s);
    }
};