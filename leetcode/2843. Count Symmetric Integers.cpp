class Solution {
public:
    int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; ++num) {
            if (num >= 1 && num <= 9) {
                num = 9;
                continue;
            }
            
            if (num >= 10 && num <= 99) {
                bool isSyc = num / 10 == num % 10;
                count += (isSyc ? 1 : 0);
            }

            if (num >= 100 && num <= 999) {
                num = 999;
                continue;
            }

            if (num >= 1000 && num <= 9999) {
                bool isSyc = (num / 1000 + num % 1000 / 100) ==
                             (num % 100 / 10 + num % 10);
                count += (isSyc ? 1 : 0);
            }
        }
        return count;
    }
};