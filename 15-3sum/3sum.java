class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>() ;
        Arrays.sort(nums) ;
        for(int i = 0 ; i < nums.length-2 ; i ++){
            if(i > 0 && nums[i]==nums[i-1]){
                    continue ;
            }
            int left = i+1 ;
            int right = nums.length-1 ;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right] ;
                if(sum == 0){
                    List<Integer> ls1 = new ArrayList<>() ;
                    ls1.add(nums[i]) ;
                    ls1.add(nums[left]) ;
                    ls1.add(nums[right]) ;
                    ls.add(ls1) ;
                    while(left < right && nums[left] == nums[left+1]){
                        // System.out.println(left) ;
                        left ++ ;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right -- ;
                    }
                    left ++ ;
                    right -- ;
                }
                else if(sum > 0){
                    right -- ;
                }
                else{
                    left ++ ;
                }
            }
        }
        return ls ;
    }
}