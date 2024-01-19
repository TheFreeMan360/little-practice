class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {
        int maxArea = getArea(dimensions[0]);
        double maxDiagonal = getDiagonal(dimensions[0]);
        for(int i = 1; i < dimensions.size(); ++i){ 
            if(getDiagonal(dimensions[i]) > maxDiagonal){
                maxArea = getArea(dimensions[i]);
                maxDiagonal = getDiagonal(dimensions[i]);
            }else if(getDiagonal(dimensions[i]) == maxDiagonal){
                maxArea = max(maxArea, getArea(dimensions[i]));
            }
        }
        return maxArea; 
    }

    inline double getDiagonal(vector<int>& dimension){
        return dimension[0] * dimension[0] + dimension[1] * dimension[1];
    }

    inline int getArea(vector<int>& dimension){
        return dimension[0] * dimension[1];
    }
};