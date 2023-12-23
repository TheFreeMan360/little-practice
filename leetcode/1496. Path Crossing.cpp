class Solution {
public:
    bool isPathCrossing(string path) {
        set<vector<int>> record;
        record.insert({0, 0});

        int x = 0, y = 0;
        for (size_t i = 0; i < path.size(); ++i) {
            if (path[i] == 'N')
                ++y;
            else if (path[i] == 'S')
                --y;
            else if (path[i] == 'E')
                ++x;
            else if (path[i] == 'W')
                --x;

            if (record.find({x, y}) != record.end()) {
                return true;
            }

            record.insert({x, y});
        }

        return false;
    }
};