//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        //creating the intital product array
        int[] answer = new int[len];
        int product = 1;
        for (int i = 0; i < len; i++){
            product*= nums[i];
            answer[i] = product;
        }
        //reiterating backwards and multiplying all elements except the i-th element
        product = 1;
        for(int i = len-1; i>0; i--){
            answer[i] = product*answer[i-1];
            product*=nums[i];
        }
        answer[0] = product;
        return answer;
    }
}
