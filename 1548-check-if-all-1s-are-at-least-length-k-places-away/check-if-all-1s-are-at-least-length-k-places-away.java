class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last = nums.length-1 ;
        for(int i = nums.length-1 ; i >= 0 ; i --){
            if(nums[i]== 1){
                last = i ;
                break ;
            }
        }
        System.out.println(last) ;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] == 1){
                int count = addval(nums , i+1 , k) ;
                // System.out.println(count) ;
                if(count < k && i != last){
                    return false ;
                }
            }
        }
        return true ;
    }
    public static int addval(int[] arr , int i , int val1){
        int val = 0 ;
        for(int k = i ; k < arr.length ; k ++){
            if(arr[k] == 1){
                break ;
            }
            else{
                val ++ ;
            }
        }
        return val ;
    }
}