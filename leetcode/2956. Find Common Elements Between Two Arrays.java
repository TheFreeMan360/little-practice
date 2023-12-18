class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        
        boolean[] haveNum1 = new boolean[101], haveNum2 = new boolean[101];
        
        for(int num : nums1) haveNum1[num] = true;
        
        for(int num : nums2){
            haveNum2[num] = true;
            if(haveNum1[num]) ++ans[1];
        }

        for(int num : nums1) if(haveNum2[num]) ++ans[0];

        return ans;
    }
}