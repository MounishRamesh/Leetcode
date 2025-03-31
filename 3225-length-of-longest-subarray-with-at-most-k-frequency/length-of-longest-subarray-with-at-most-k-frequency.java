import java.util.HashMap;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i1 = 0;
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);

            while (hs.get(nums[i]) > k) {
                hs.put(nums[i1], hs.get(nums[i1]) - 1);
                if (hs.get(nums[i1]) == 0) {
                    hs.remove(nums[i1]);
                }
                i1++;
            }

            count = Math.max(count, i - i1 + 1);
        }

        return count;
    }
}
