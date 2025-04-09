class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> hs = new HashSet<>() ;
        Arrays.sort(nums) ;
        for(int i : nums){
            hs.add(i) ;
        }
        for(int i = nums.length-1 ;i >=0 ;i --){
            if(nums[i] < 0){
                return -1 ;
            }
            int val = nums[i] * -1 ;
            if(hs.contains(val)){
                return nums[i] ;
            }
        }
        return -1 ;
    }
}