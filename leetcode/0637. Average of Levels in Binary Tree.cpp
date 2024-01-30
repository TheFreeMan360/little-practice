/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> ans;

        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            double levelSum = 0;
            
            int levelSize = q.size();
            for(int i = 0; i < levelSize; ++i){
                TreeNode* curr = q.front();
                q.pop();

                levelSum += curr->val;

                if(curr->right != nullptr){
                    q.push(curr->right);
                }

                if(curr->left != nullptr){
                    q.push(curr->left);
                }
            }

            ans.push_back(levelSum / levelSize);
        }
        return ans;
    }
};