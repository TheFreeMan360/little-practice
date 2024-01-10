class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        unordered_map<int, int> banknotes = {{5, 0}, {10, 0}};
        
        for(int bill : bills){
            if(bill == 5){
                banknotes[5] += 1;
            }else if(bill == 10){
                if(banknotes[5] <= 0)
                    return false;
                banknotes[5] -= 1;
                banknotes[10] += 1;
            }else if(bill == 20){
               if(banknotes[5] >= 1 && banknotes[10] >= 1){
                   banknotes[5] -= 1;
                   banknotes[10] -= 1;
               }else if(banknotes[5] >= 3){
                   banknotes[5] -= 3;
               }else{
                   return false;
               }
            }
        }
        return true;
    }
};