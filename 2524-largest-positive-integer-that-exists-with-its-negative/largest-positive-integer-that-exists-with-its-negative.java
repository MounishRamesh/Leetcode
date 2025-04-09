class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> hs = new HashSet<>() ;
        Arrays.sort(nums) ;
        for(int i : nums){
            hs.add(i) ;
        }
        int i = 0 ;
        int j = nums.length-1 ;
        while(i < j){
            int val1 =  nums[i] ;
            int val2 = nums[j] ;
            if(val1 == -(val2)){
                return val2 ;
            }
            else if(Math.abs(val1) > Math.abs(val2)){
                i ++ ;
            }
            else{
                j -- ;
            }
        }
        return -1 ;
    }
}