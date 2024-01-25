class Solution:
    def countLatticePoints(self, circles: List[List[int]]) -> int:
        # circle formula => (X - Xm) ^ 2 + (Y - Ym) ^ 2 = r ^ 2 
        in_circle_points = set()
        
        for xm, ym, r in circles:
            for x in range(xm - r, xm + r + 1):
                for y in range(ym - r, ym + r + 1):
                    if (x - xm)**2 + (y - ym)**2 <= r**2:
                        in_circle_points.add((x, y))

        return len(in_circle_points)