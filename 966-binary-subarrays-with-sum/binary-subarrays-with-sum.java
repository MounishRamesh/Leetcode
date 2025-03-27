class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hs = new HashMap<>() ;
        int count = 0 ;
        int sum = 0 ;
        for(int i = 0 ; i< nums.length ;i ++){
            sum = sum + nums[i] ;
            if(sum == goal){
                count ++ ;
            }
            if(hs.containsKey(sum - goal)){
                count += hs.get(sum - goal) ;
            }
            if(hs.containsKey(sum)){
                hs.put(sum , hs.get((sum)) + 1) ;
            }
            else{
                hs.put(sum , 1) ;
            }
        }
        return count ;
    }
}