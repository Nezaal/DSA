class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int n = s.length();
        int maxLen = 0;
        int i =0;

        for(int j = 0; j < n ; j++){

            while(st.contains(s.charAt(j))){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(s.charAt(j));

            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
} 

// 0 1 2 3 4 5 6 7 
// a b c a b c b b
// i
//       j


// max len = 0 