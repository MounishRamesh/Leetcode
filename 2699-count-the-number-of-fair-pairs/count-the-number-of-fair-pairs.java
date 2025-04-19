class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            int left = lower - nums[i];
            int right = upper - nums[i];
            
            int start = lowerBound(nums, left, i + 1);
            int end = lowerBound(nums, right + 1, i + 1);
            
            count += (end - start);
        }

        return count;
    }

    public static int lowerBound(int[] nums, int target, int start) {
        int low = start, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}