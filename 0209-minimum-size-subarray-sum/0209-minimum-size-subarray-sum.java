class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        int minLen = Integer.MAX_VALUE;
        int curSum = 0;
        int i = 0;
        for(int j = 0; j < n; j++){
            curSum += nums[j];
            
            while(curSum >= target){

                minLen = Math.min(minLen, j - i + 1);
                curSum -= nums[i];
                i++;

            } 

        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }else{
            return minLen;
        }
    }
}

// 0 1 2 3 4 5
// 2,3,1,2,4,3
//         i
//           j

// target = 7

// cur-sum = 8 
// currLen = 4
// min len = 99999999