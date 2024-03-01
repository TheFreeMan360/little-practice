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
    bool isEvenOddTree(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);
        bool isEvenIndedxedLevel = true;

        while (!q.empty()) {
            int prev = isEvenIndedxedLevel ? INT_MIN : INT_MAX;
            
            const int qSize = q.size();
            for (int i = 0; i < qSize; ++i) {
                TreeNode* curr = q.front();
                q.pop();

                bool isEvenNumber = (curr->val % 2) == 0;

                if (isEvenIndedxedLevel &&
                    (isEvenNumber || prev >= curr->val)) {
                    return false;
                }

                if (!isEvenIndedxedLevel &&
                    (!isEvenNumber || prev <= curr->val)) {
                    return false;
                }

                if (curr->left != nullptr)
                    q.push(curr->left);

                if (curr->right != nullptr)
                    q.push(curr->right);

                prev = curr->val;
            }

            isEvenIndedxedLevel = !isEvenIndedxedLevel;
        }
        return true;
    }
};