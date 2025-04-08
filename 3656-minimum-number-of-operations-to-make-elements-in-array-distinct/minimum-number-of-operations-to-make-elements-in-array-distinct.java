class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i =0 ;i < nums.length ;i +=3){
            boolean val = false ;
            HashMap<Integer,Integer> hs= new HashMap<>() ;
            for(int j = i ;j < nums.length ;j ++){
                if(hs.containsKey(nums[j])){
                    val = true ;
                    break ;
                }
                else{
                    hs.put(nums[j] , 1); 
                }
            }
            if(val == true){
                count ++ ;
            }
        }
        return count  ;
    }
}