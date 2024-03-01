# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isEvenOddTree(self, root: Optional[TreeNode]) -> bool:
        queue = list()
        queue.append(root)
        isEvenLevel = True

        while len(queue) > 0:
            q_len = len(queue)
            prev = float("-inf") if isEvenLevel else float("inf")

            for _ in range(q_len):
                curr = queue.pop(0)

                if isEvenLevel and (curr.val % 2 == 0 or prev >= curr.val):
                    return False

                if not isEvenLevel and (curr.val % 2 == 1 or prev <= curr.val):
                    return False

                if curr.left != None:
                    queue.append(curr.left)

                if curr.right != None:
                    queue.append(curr.right)

                prev = curr.val

            isEvenLevel = not isEvenLevel

        return True

    # def isEvenOddTree(self, root: Optional[TreeNode]) -> bool:
    #     levels_nums = []

    #     def dfs(root, depth) -> None:
    #         if root is None:
    #             return

    #         if depth > len(levels_nums) - 1:
    #             levels_nums.append([])

    #         levels_nums[depth].append(root.val)
    #         dfs(root.left, depth + 1)
    #         dfs(root.right, depth + 1)

    #     dfs(root, 0)

    #     for level_index, level_nums in enumerate(levels_nums):
    #         if level_index % 2 == 0:
    #             for i in range(len(level_nums) - 1):
    #                 if level_nums[i] >= level_nums[i + 1] or level_nums[i] % 2 == 0:
    #                     return False

    #             if level_nums[-1] % 2 == 0:
    #                 return False

    #         if level_index % 2 == 1:
    #             for i in range(len(level_nums) - 1):
    #                 if level_nums[i] <= level_nums[i + 1] or level_nums[i] % 2 == 1:
    #                     return False

    #             if level_nums[-1] % 2 == 1:
    #                 return False

    #     return True