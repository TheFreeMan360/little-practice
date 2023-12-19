class Solution:
    def imageSmoother(self, img: List[List[int]]) -> List[List[int]]:
        return [
            [self.getFiteredValue(img, i, j) for j in range(len(img[0]))] 
            for i in range(len(img))
        ]
        
    def getFiteredValue(self, img: List[List[int]], x: int, y: int) -> int:
        tmp = [
            img[r][c]
            for c in range(max(0, y - 1), min(len(img[0]), y + 2)) 
            for r in range(max(0, x - 1), min(len(img), x + 2))
        ]
        return sum(tmp) // len(tmp)