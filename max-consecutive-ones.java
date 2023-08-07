//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0, start = 0, end =0;
        while(end < nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros > k){
                if(nums[start]==0){
                    zeros--;
                }
                start++;
            }
        } 
        return end-start;
    }
}