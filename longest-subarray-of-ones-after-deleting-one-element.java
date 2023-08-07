//Given a binary array nums, you should delete one element from it.
//Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0, end = 0, zeros = 0;
        while(end < nums.length){
            zeros += nums[end]==0 ? 1:0;
            end++;
            if (zeros > 1){
                zeros -= nums[start] == 0 ? 1:0;
                start++;
            }
        }
        return Math.max(end-start-1, 0);
    }
}