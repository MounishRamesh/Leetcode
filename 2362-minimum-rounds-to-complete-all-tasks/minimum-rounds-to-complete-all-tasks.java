class Solution {
    public int minimumRounds(int[] nums) {
        Arrays.sort(nums) ;
        int count = 0 ;
        int n = nums.length ;
        int i =0 ;
        while(i < n){
            int val= 1 ;
            while(i+1 < n && (nums[i] == nums[i+1])){
                val ++ ;
                i ++ ;
            }
            if(val == 1){
                return -1 ;
            }
            if(val % 3 == 0){
                count += val / 3 ;
            }
            else{
                count += val / 3 + 1 ;
            }
            i ++ ;
        }
        return count ;
    }
}