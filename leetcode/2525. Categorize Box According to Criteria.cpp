class Solution {
public:
    string categorizeBox(long long length, long long width, long long height, int mass) {
        long long w = 1e4, g = 1e9, volume = length * width * height;
        bool isBulky = length >= w || width >= w || height >= w || volume >= g;
        bool isHeavy = mass >= 100;

        if (isBulky && isHeavy)
            return "Both";
        if (!isBulky && isHeavy)
            return "Heavy";
        if (isBulky && !isHeavy)
            return "Bulky";
        return "Neither";
    }
};