class Solution {
    public int waysToSplitArray(int[] nums) {
        long left = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            sum -= nums[i];
            if (left >= sum) {
                count++;
            }
        }
        return count;
    }
}
