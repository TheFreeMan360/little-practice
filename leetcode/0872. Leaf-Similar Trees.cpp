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
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector<int> t1Leaf;
        vector<int> t2Leaf;
        getLeafValue(root1, t1Leaf);
        getLeafValue(root2, t2Leaf);

        if (t1Leaf.size() != t2Leaf.size()) {
            return false;
        }

        for (int i = 0; i < t2Leaf.size(); ++i) {
            if (t1Leaf[i] != t2Leaf[i]) {
                return false;
            }
        }
        return true;
    }

    void getLeafValue(TreeNode* root, vector<int>& vec) {
        if (root == nullptr)
            return;

        if (root->left == root->right) {
            vec.push_back(root->val);
        }
        getLeafValue(root->left, vec);
        getLeafValue(root->right, vec);
    }
};