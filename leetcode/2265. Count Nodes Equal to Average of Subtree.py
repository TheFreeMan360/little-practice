# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfSubtree(self, root: TreeNode) -> int:
        return self.dfs(root)[0]

    def dfs(self, root: TreeNode) -> tuple[int]:
        if not root:
            return (0, 0, 0)

        if root.left == root.right:
            return (1, root.val, 1)

        lans, lsum, ln = self.dfs(root.left)
        rans, rsum, rn = self.dfs(root.right)

        all_sum = lsum + rsum + root.val
        all_node = ln + rn + 1
        eq_node = lans + rans + (1 if (all_sum // all_node) == root.val else 0)
        return (eq_node, all_sum, all_node)
