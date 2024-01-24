class Solution:
    def maxLength(self, arr: List[str]) -> int:
        arr = [e for e in arr if len(e) == len(set(e))]
        return self.dfs(arr, set(), 0)

    def dfs(self, arr, path, i) -> int:
        if i >= len(arr):
            return len(path)

        if len(path.intersection(set(arr[i]))) > 0:
            return self.dfs(arr, path, i + 1)

        return max(
            self.dfs(arr, path | set(arr[i]), i + 1),
            self.dfs(arr, path, i + 1))
