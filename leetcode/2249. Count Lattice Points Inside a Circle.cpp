class Solution {
public:
    int countLatticePoints(vector<vector<int>>& circles) {
        // circle formula => (X - Xm) ^ 2 + (Y - Ym) ^ 2 = r ^ 2
        set<pair<int, int>> inCirclePoints;

        for (const auto& circle : circles) {
            int xm = circle[0], ym = circle[1], r = circle[2];
            for (int x = xm - r; x <= xm + r; ++x) {
                for (int y = ym - r; y <= ym + r; ++y) {
                    bool pointIsInCircle =
                        (x - xm) * (x - xm) + (y - ym) * (y - ym) <= r * r;
                    if (pointIsInCircle) {
                        inCirclePoints.insert(make_pair(x, y));
                    }
                }
            }
        }
        return inCirclePoints.size();
    }
};