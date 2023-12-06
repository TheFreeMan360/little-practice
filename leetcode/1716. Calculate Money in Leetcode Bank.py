class Solution:
    def totalMoney(self, n: int) -> int:
        sum_ = 0 
        nthMonday = 1
        
        for w in range(n//7, 0, -1):
            sum_ += (2 * nthMonday + 6)  * 7 // 2
            nthMonday += 1
        
        sum_ += (2 * nthMonday + (n % 7 - 1)) * (n % 7) // 2
        return sum_