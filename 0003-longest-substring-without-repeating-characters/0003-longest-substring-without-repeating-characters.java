class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        boolean[] isVisited = new boolean[256];
        int left = 0 , right = 0 , longest = 1;
        while(right < s.length()){
            char ch = s.charAt(right);
            if(isVisited[ch]){
                longest = Math.max(longest,right-left);
                while(isVisited[ch]){
                    isVisited[s.charAt(left++)] = false;
                }
            }
            isVisited[ch] = true;
            right++;
        }
        longest = Math.max(longest,right-left);
        return longest;
    }
}