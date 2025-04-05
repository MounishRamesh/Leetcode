class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0 ;
        int n = nums.length ;
        int subsets = (int)Math.pow(2,n) ;
        for(int i = 1 ;i < subsets ;i ++){
            List<Integer> ls = new ArrayList<>() ;
            int xor = 0 ;
            for(int j = 0 ;j < n; j++){
                int ans = (int)Math.pow(2,j) ;
                int val = i /ans ;
                if(val % 2 == 1){
                    ls.add(nums[j]) ;
                }
            }
            for(int num : ls){
                xor ^= num ;
            }
            sum = sum + xor ;
        }
        return sum ;
    }
}