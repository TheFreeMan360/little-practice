# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        t1 = list()
        t2 = list()
        self.get_leaf_value(root1, t1)
        self.get_leaf_value(root2, t2)
        
        if len(t1) != len(t2):
            return False 

        for i in range(len(t1)):
            if t1[i] != t2[i]:
                return False

        return True
        

    def get_leaf_value(self, root: Optional[TreeNode], lis: List[int]) -> None:
        if root is None:
            return 
        
        if root.left is None and root.right is None:
            lis.append(root.val)
         
        self.get_leaf_value(root.left, lis)
        self.get_leaf_value(root.right, lis)
    