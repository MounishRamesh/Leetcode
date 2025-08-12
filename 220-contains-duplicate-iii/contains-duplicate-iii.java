class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> ts = new TreeSet<>() ;
        for(int i = 0 ;i < nums.length ; i ++){
            long x = nums[i] ;
            if(ts.ceiling(x) != null && Math.abs(ts.ceiling(x)-nums[i]) <= valueDiff){
                return true ;
            }
            if(ts.floor(x) != null && Math.abs(ts.floor(x)-nums[i]) <= valueDiff){
                return true ;
            }
            ts.add(x);
            if(i >= indexDiff){
                ts.remove((long)(nums[i-indexDiff])) ;
            }
        }
        return false ;
    }
}