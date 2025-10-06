class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0 ;
        for(int i : nums){
            sum += i ;
        }
        if(sum%p == 0){
            return 0 ;
        }
        int rem = (int)(sum%p) ;
        int min = Integer.MAX_VALUE ;
        long pre = 0 ;
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        hs.put(0 , -1) ;
        for(int i = 0 ; i < nums.length ; i ++){
            pre += nums[i] ;
            int curr = (int)(pre%p) ;
            int tar = (curr - rem+p)%p ;
            if(hs.containsKey(tar)){
                min = Math.min(min , i-hs.get(tar)) ;
            }
            hs.put(curr , i) ;
        }
        if(min == nums.length){
            return -1 ;
        }
        return min ;
    }
}