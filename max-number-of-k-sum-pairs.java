//You are given an integer array nums and an integer k.
//In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
//Return the maximum number of operations you can perform on the array.

import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
    Arrays.sort(nums);
        int left=0,right = nums.length-1,count=0;
        while(left<right) {
            int sum = nums[left] + nums[right];

            if(sum == k) {
                left++;
                right--;
                count++;
            }else if(sum>k) {
                right--;
            }else {
                left++;
            }
        }
        return count;
    }        
}