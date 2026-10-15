class Solution {
    int square(int number) {
        return number * number;
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];

        int i = 0, j = n - 1;
        int k = n-1;
        while (i <= j) {
            if (square(nums[i]) < square(nums[j])) {
                res[k] = square(nums[j]);
                j--;
            } else {
                res[k] = square(nums[i]);
                i++;
            }
            k--;
        }
        return res;
    }
}