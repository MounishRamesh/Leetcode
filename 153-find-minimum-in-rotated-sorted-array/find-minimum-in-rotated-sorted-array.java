class Solution {
    public int findMin(int[] nums) {
        int i = 0 ;
        int j = nums.length-1 ;
        int min = Integer.MAX_VALUE ;
        while(i <= j){
            int mid = i+(j-i)/2 ;
            System.out.println(mid) ;
            if(nums[i] < nums[mid]){
                min = Math.min(min , nums[i]) ;
                i = mid +1 ;
            }
            // System.out.println(nums[mid]) ;
            else{
                int min1 = Math.min(nums[mid] , nums[j]) ;
                min = Math.min(min , min1) ;
                j = mid-1 ;
            }
        }
        return min ;
    }
}