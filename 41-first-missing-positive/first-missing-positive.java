class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> hs = new TreeSet<>(); 
        for(int i : nums){
            hs.add(i) ;
        }
        int min = 1 ;
        for(int i : hs){
            if(i > 0){
                if(i != min){
                    return min ;
                }
                min ++ ;
            } 
        }
        if(hs.last() > 0){
            int val = hs.last()+1 ;
            return val ;
        }
        return 1 ;
    }
}