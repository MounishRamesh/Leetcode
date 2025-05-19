class Solution {
    public String triangleType(int[] nums) {
        int n = nums.length ;
        if(nums[0] == nums[1] && nums[1] == nums[2]){
            return "equilateral"; 
        }
        int[] arr = new int[3] ;
        int k = 0 ;
        for(int i = 0 ;i < n-1 ;i ++){
            for(int j = i+1 ; j < n ; j ++){
                int sum = nums[i] + nums[j] ;
                if(sum <= nums[n-j-i]){
                    return "none" ;
                }
                else{
                    arr[k] = sum ;
                    k ++ ;
                }
            }
        }
        if(arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]){
            return "isosceles" ;
        }
        return "scalene" ;
    }
}