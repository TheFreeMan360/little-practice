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
    int maxAncestorDiff(TreeNode* root) {
        if (root == nullptr) return 0;
        return findMax(root, root->val, root->val);
    }

    int findMax(TreeNode* root, int curMax, int curMin) {
        if (root == nullptr) return 0;

        int possibleResult =
            max(abs(curMax - root->val), abs(curMin - root->val));
        int maxNum = max(maxNum, possibleResult);

        curMax = max(root->val, curMax);
        curMin = min(root->val, curMin);

        maxNum = max(maxNum, findMax(root->left, curMax, curMin));
        maxNum = max(maxNum, findMax(root->right, curMax, curMin));

        return maxNum;
    }
};