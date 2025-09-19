class Solution {
    public int distributeCandies(int[] candy) {
        int n = candy.length ;
        HashSet<Integer> hs = new HashSet<>() ;
        for(int i : candy){
            hs.add(i) ;
        }
        n = n/2 ;
        if(hs.size() < n){
            return hs.size() ;
        }
        return n ;
    }
}