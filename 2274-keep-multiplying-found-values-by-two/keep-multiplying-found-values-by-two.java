class Solution {
    public int findFinalValue(int[] nums, int o) {
        int count = o ;
        HashSet<Integer> hs = new HashSet<>() ;
        for(int i : nums){
            hs.add(i);
        }
        boolean ans = false ;
        while(hs.contains(count)){
            count = count * 2 ;
            ans = true ;
        }
        return count ;
    }
}