class Solution:
    def findWinners(self, matches: List[List[int]]) -> List[List[int]]:
        lost = dict()
        for winner, loser in matches:
            if winner not in lost:
                lost[winner] = 0
            
            lost[loser] = lost.get(loser, 0) + 1 

        all_win = list()
        win_one = list()

        for player, l in lost.items():
            if l == 0:
                all_win.append(player)
            if l == 1:
                win_one.append(player)
        
        return [sorted(all_win), sorted(win_one)]