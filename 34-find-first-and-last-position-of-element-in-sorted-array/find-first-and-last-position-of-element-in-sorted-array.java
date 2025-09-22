class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0 ; 
        int j = nums.length-1 ;
        int[] arr = new int[2] ;
        while(i <= j && nums.length>= 1){
            int mid = (i+j)/2 ;
            // System.out.println(mid) ;
            if(nums[mid] == target){
                while(i < mid && nums[mid]== nums[mid-1]){
                    mid -- ;
                }
                arr[0] = mid ;
                while(mid < j && nums[mid] == nums[mid+1]){
                    mid++ ;
                }
                arr[1] = mid ;
                i ++ ;
                j -- ;
                return arr ;
            }
            else if(nums[mid] < target){
                i = mid+1 ;
            }
            else{
                j = mid-1 ;
            }
        }
        arr[0] = -1 ;
        arr[1] = -1 ;
        return arr ;
    }
}