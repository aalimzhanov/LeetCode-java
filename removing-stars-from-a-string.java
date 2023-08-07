//You are given a string s, which contains stars *.
//In one operation, you can:
//Choose a star in s.
//Remove the closest non-star character to its left, as well as remove the star itself.
//Return the string after all stars have been removed.

import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char ch : chars){
            if(ch == '*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.reverse().toString();
    }
}