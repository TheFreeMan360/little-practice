class Solution:
    def isPathCrossing(self, path: str) -> bool:
        record = set()
        record.add("0,0")

        x, y = 0, 0
        for p in path:
            if p == 'N':
                y += 1
            elif p == 'S':
                y -= 1
            elif p == 'W':
                x -= 1
            elif p == 'E':
                x += 1

            cood = str(x) + ',' + str(y)
            print(cood)
            
            if cood in record:
                return True
            
            record.add(cood)
        
        return False