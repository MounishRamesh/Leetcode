class Solution {
    public int singleNumber(int[] nums) {
        int count = 0 ;
        for(int i : nums){
            count = count ^ i ;
        }
        return count ;
    }
}