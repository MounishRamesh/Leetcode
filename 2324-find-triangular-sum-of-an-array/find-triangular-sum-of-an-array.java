class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> ls = new ArrayList<>() ;
        for(int i= 0 ;i < nums.length ;i ++){
            ls.add(nums[i]) ;
        }
        while(ls.size() > 1){
            List<Integer>ls1 = new ArrayList<>() ;
            for(int j = 0 ; j < ls.size()-1; j ++){
                int val = (ls.get(j) + ls.get(j+1))% 10 ;
                ls1.add(val) ; 
            }
            ls = ls1 ;
            if(ls.size() == 1){
                break ;
            }
        }
        int ans = ls.get(0); 
        return ans ;
    }
}