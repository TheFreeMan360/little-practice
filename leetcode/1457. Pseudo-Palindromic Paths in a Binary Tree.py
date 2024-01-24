# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pseudoPalindromicPaths(self, root: Optional[TreeNode]) -> int:
        return self.dfs(root, True, 0)

    def dfs(self, root, is_odd_level, bitnum):
        if root is None:
            return 0

        if root.left == root.right:
            bitnum ^= 1 << root.val  # filp
            cond1 = is_odd_level and bin(bitnum).count("1") == 1
            cond2 = not is_odd_level and bin(bitnum).count("1") == 0
            return 1 if cond1 or cond2 else 0

        bitnum ^= 1 << root.val  # filp

        return (self.dfs(root.left, not is_odd_level, bitnum) + 
               self.dfs(root.right, not is_odd_level, bitnum))
