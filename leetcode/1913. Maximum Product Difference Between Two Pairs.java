class Solution {
    public int maxProductDifference(int[] nums) {
        int largest = 0, secondLarge = 0, 
            smallest = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;

        for(int num : nums){
            if(num > largest){
                secondLarge = largest;
                largest = num;
            }else if(num > secondLarge){
                secondLarge = num;
            }

            if(num < smallest){
                secondSmall = smallest;
                smallest = num;
            }else if(num < secondSmall){
                secondSmall = num;
            }
        } 

        return (largest * secondLarge) - (smallest * secondSmall); 
    }
}