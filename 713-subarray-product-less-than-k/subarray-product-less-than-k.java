class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i, prod = 1;
            while (j < nums.length) {
                prod *= nums[j];
                j++;

                if (prod < k) {
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}