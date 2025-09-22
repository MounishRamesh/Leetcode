class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<>() ;
        Arrays.sort(nums) ;
        for(int i = 0 ; i < nums.length-3; i ++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue ;
            }
            for(int j = i+1 ; j < nums.length-2 ;j ++){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue ;
                }
                int left = j+1 ;
                int right = nums.length-1 ;
                while(left < right){
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right] ;
                    if(sum == target){
                        List<Integer> ls1 = new ArrayList<>() ;
                        ls1.add(nums[i]) ;
                        ls1.add(nums[j]) ;
                        ls1.add(nums[left]) ;
                        ls1.add(nums[right]) ;
                        ls.add(ls1) ;
                        while(left < right && nums[left] == nums[left+1]){
                            left ++ ;
                        }
                        while(left < right && nums[right] == nums[right-1]){
                            right -- ;
                        }
                        left ++ ;
                        right -- ;
                    }
                    else if(sum < (long)(target)){
                        left ++ ;
                    }
                    else{
                        right -- ;
                    }
                }
            }
        }
        return ls ;
    }
}