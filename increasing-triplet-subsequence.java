//Given an integer array nums, return true if there exists a triple of indices (i, j, k) 
//such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i : nums){
            if(smallest >= i){
                smallest = i;
            }
            else if(secondSmallest >= i){
                secondSmallest = i;
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}