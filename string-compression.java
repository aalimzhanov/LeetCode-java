//Given an array of characters chars, compress it using the following algorithm:
//Begin with an empty string s. For each group of consecutive repeating characters in chars:
//If the group's length is 1, append the character to s.
//Otherwise, append the character followed by the group's length.
//The compressed string s should not be returned separately, but instead, be stored in the input character array chars. 
//Return the length of the new array

class Solution {
    public int compress(char[] chars) {
        String s = "";
        char group = chars[0];
        int count  = 0; 
        for (char c : chars){
            if (group == c){
                count++;
            }
            else{
                s = newGroup(s, group, count);
                group = c;
                count = 1;
            }
        }
        s = newGroup(s, group, count);
        for(int i=0; i<s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();

    }
    private String newGroup(String s, char group, int count){
        if(count == 1){
            return s+group;
        }
        return s+group+Integer.toString(count);
    }
}