//Given an input string s, reverse the order of the words.

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int left = 0, right = words.length-1;
        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left ++;
            right --;
        }
        return String.join(" ", words);
    }
}