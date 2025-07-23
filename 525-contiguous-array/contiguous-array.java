class Solution {
    public int findMaxLength(int[] nums) {
        int count = 0 ;
        int max = 0 ;
        HashMap<Integer , Integer > hs = new HashMap<>() ;
        hs.put(0,-1) ;
        for(int i = 0 ;i < nums.length ;i ++){
            if(nums[i] == 0){
                count += -1 ;
            }
            else{
                count += 1 ;
            }
            if(hs.containsKey(count)){
                int value = i-hs.get(count) ;
                max = Math.max(max , value) ;
            }
            else{
                hs.put(count,i) ;
            }
        }
        return max ;
    }
}