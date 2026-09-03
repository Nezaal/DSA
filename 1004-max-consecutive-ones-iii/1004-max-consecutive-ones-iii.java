class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;

        int maxLen = 0;
        int oneFreq = 0;
        int zeroFreq = 0;
        


        int i = 0; 
        for(int j = 0; j < n; j++){
            int num = nums[j];

            if(num == 1){
                oneFreq++;
            }
            while(j-i+1 - oneFreq > k){
                if(nums[i] == 1) oneFreq--;
                i++;
                
            }
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
}

// 0 1 2 3 4 5 6 7 8 9 10
// 1,1,1,0,0,0,1,1,1,1,0], k = 2
//   i          
//         j

// window size = 6
// no.of ones = 2


// while(window - ones > k)
// maxLen = 5