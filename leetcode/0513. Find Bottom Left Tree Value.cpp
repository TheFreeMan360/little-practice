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
    int findBottomLeftValue(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);

        while(!q.empty()){
            root = q.front();
            q.pop();

            if(root->right != nullptr)
                q.push(root->right);
                
            if(root->left != nullptr)
                q.push(root->left);
        }
        return root->val;
    }

    // int findBottomLeftValue(TreeNode* root) {
    //     int ans, prev = -1;
    //     dfs(root, ans, prev, 0);
    //     return ans;
    // }

    // void dfs(TreeNode* root, int& ans, int& prevLevel, int currLevel) {
    //     if (root == nullptr) {
    //         return;
    //     }
    //     if (root->left == root->right &&
    //         (prevLevel == -1 || currLevel > prevLevel)) {
    //         ans = root->val;
    //         prevLevel = currLevel;
    //     }

    //     dfs(root->left, ans, prevLevel, currLevel + 1);
    //     dfs(root->right, ans, prevLevel, currLevel + 1);
    // }
};