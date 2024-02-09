class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        ans = [""] * len(score)
        for i, guy_score in enumerate(
            sorted(list(enumerate(score)), key=lambda e: e[1], reverse=True)
        ):
            if i == 0:
                ans[guy_score[0]] = "Gold Medal"
            elif i == 1:
                ans[guy_score[0]] = "Silver Medal"
            elif i == 2:
                ans[guy_score[0]] = "Bronze Medal"
            else:
                ans[guy_score[0]] = str(i + 1)

        return ans