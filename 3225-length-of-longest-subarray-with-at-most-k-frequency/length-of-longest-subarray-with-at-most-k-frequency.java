class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = 0;
        for (int end = 0;end<nums.length;end++){
            hm.put(nums[end],hm.getOrDefault(nums[end],0)+1);
            while(hm.get(nums[end])>k){
                hm.put(nums[start],hm.get(nums[start])-1);
                start++;
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}