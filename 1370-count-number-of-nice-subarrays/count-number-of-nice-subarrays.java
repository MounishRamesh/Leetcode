class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count1 = 0 ;
        int i = 0 ;
        int j = 0 ;
        int total = 0 ;
        while(j < nums.length){
            if(nums[j]%2 != 0){
                total ++ ;
            }
            while(total > k){
                // i ++ ;
                if(nums[i]%2 != 0){
                    total -- ;
                }
                i ++ ;
            }
            count1 += (j-i+1) ;
            j ++ ;
        }
        int count2 = 0 ;
        int i1 = 0 ;
        int j1 = 0 ;
        int total2 = 0 ;
        while(j1 < nums.length){
            if(nums[j1]%2 != 0){
                total2 ++ ;
            }
            while(total2 > k-1){
                if(nums[i1]%2 != 0){
                    total2 -- ;
                }
                i1 ++ ;
            }
            count2 += (j1-i1+1) ;
            j1 ++ ;
        }
        return Math.abs(count1-count2) ;
    }
}