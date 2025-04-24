class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fir = Integer.MAX_VALUE ;
        int sec = Integer.MAX_VALUE ;
        for(int i : nums){
            if(i <= fir){
                fir = i ;
            }
            else if(i <= sec){
                sec = i ;
            }
            else{
                return true ;
            }
        }
        return false ;
    }
}