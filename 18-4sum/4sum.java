class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<>() ;
        Arrays.sort(nums) ;
        for(int i = 0 ; i < nums.length-3; i ++){
            for(int j = i+1 ; j < nums.length-2 ;j ++){
                int left = j+1 ;
                int right = nums.length-1 ;
                while(left < right){
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right] ;
                    // System.out.println(sum) ;
                    if(sum == target){
                        List<Integer> ls1 = new ArrayList<>() ;
                        ls1.add(nums[i]) ;
                        ls1.add(nums[j]) ;
                        ls1.add(nums[left]) ;
                        ls1.add(nums[right]) ;
                        if(!ls.contains(ls1)){
                            ls.add(ls1) ;
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