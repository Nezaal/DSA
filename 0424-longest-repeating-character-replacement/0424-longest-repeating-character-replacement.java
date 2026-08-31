class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int maxLen = 0;
        int i = 0;
        for(int j = 0; j < n; j++){
            char ch = s.charAt(j);
            int freq = map.getOrDefault(ch,0)+1;
             
            maxFreq = Math.max(maxFreq, freq);
            map.put(ch, freq);

            while(j-i+1 - maxFreq > k){
                char leftCh = s.charAt(i);

                map.put(leftCh, map.get(leftCh)-1);
                if(map.get(leftCh) == 0){
                    map.remove(leftCh);
                }
                i++;

            }


            maxLen = Math.max(maxLen , j-i+1);
            
        }
        return maxLen;
    }
}

// // 0 1 2 3 4 5 6
// // A A B A B B A
// //   i
// //         j

// // k = 1
// freq of A= 2
// frwq of B= 2

// longest  = 2


// windowSize - maxFeq < k