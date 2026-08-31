class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();
        int maxLen= 0;

        int i = 0;
        for(int j = 0; j < n ; j++){
            char ch = s.charAt(j);

               

            if(map.containsKey(ch)){
                i = Math.max(i , map.get(ch)+1);
            }
            map.put(ch, j);
            

            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
}


// a b c a b c b b
// p w w k e w
// i
