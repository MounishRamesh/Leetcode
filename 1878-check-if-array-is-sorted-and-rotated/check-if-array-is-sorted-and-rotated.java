class Solution {
    public boolean check(int[] nums) {
        List<Integer> ls = new ArrayList<>() ;
        for(int i : nums){
            ls.add(i) ;
        }
        for(int i = 0 ; i < nums.length ; i ++){
            Collections.rotate(ls,1) ;
            boolean ans = false ;
            for(int j = 0 ; j < nums.length-1 ; j ++){
                if(ls.get(j) > ls.get(j+1)){
                    ans = true ;
                    break ;
                }
            }
            if(!ans){
                return true ;
            }
        }
        return false ;
    }
}