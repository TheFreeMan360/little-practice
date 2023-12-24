#include <iostream>
#include <queue>
#include <stack>
#include <vector>

using namespace std;

template <typename T>
class TreeNode {
   public:
    TreeNode() {
        this->val = data;
        this->left = nullptr;
        this->right = nullptr;
    }

    TreeNode(T data, TreeNode<T>* l, TreeNode<T>* r) {
        this->val = data;
        this->left = l;
        this->right = r;
    }

    ~TreeNode() {
        delete this->val;
        delete this->left;
        delete this->right;
    }

   private:
    T val;
    TreeNode<T>* left;
    TreeNode<T>* right;
    friend class BinaryTree<T>;
};

template <typename T>
class BinaryTree {
   public:
    BinaryTree(){};

    ~BinaryTree() {
        delete this->root;
    }

    vector<T> toPreorderVector() {
        vector<T> ls;
        if (this->root == nullptr)
            return ls;

        stack<TreeNode<T>*> st;
        st.push(this->root);

        while (!st.empty()) {
            TreeNode<T>* curr = st.top();
            st.pop();

            ls.push_back(curr->val);

            if (curr->right != nullptr)
                st.push(curr->right);
            if (curr->left != nullptr)
                st.push(curr->left);
        }

        return ls;
    }

    vector<T> toInorderVector() {
        vector<T> ls;
        if (this->root == nullptr)
            return ls;

        stack<TreeNode<T>*> st;
        TreeNode<T>* curr = this->root;

        while (curr != nullptr || !st.empty()) {
            while (curr != nullptr) {
                st.push(curr);
                curr = curr->left;
            }

            curr = st.top();
            st.pop();

            ls.push_back(curr->val);
            curr = curr->right;
        }

        return ls;
    }

    vector<T> toPostorderVector() {
        vector<T> ls;
        if (this->root == nullptr)
            return ls;

        stack<TreeNode<T>*> s1, s2;
        s1.push(this->root);

        while (!s1.empty()) {
            TreeNode<T>* curr = s1.top();
            s1.pop();

            s2.push(curr);

            if (curr->left != nullptr)
                s1.push(curr->left);
            if (curr->right != nullptr)
                s1.push(curr->right);
        }

        while (!s2.empty()) {
            ls.push_back(s2.top()->val);
            s2.pop();
        }

        return ls;
    }

   private:
    TreeNode<T>* root;
};

int main() {
    return 0;
}