class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        int n = s.length();
        int maxLen = 0;
        int maxFreq = 0;
        int i = 0;

        for(int j = 0; j < n; j++){

            char ch = s.charAt(j);
            int freq = map.getOrDefault(ch, 0)+1;
            map.put(ch, freq);
            maxFreq = Math.max(maxFreq, freq);

            while( j-i+1 - maxFreq > k){
                char leftCh = s.charAt(i);

                map.put(leftCh , map.get(leftCh)-1);
                if(map.get(leftCh) == 0){
                    map.remove(leftCh);
                }   
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;

    }
}

