class Solution {
    public int lastStoneWeight(int[] stones) {
        int j = stones.length;
        for(int i = stones.length ;i > 1 ;i --){
            Arrays.sort(stones) ;
            stones[j-2] = stones[j-1] - stones[j-2] ;
            j -- ;
        }
        int c = stones[0] ;
        return c ;
    }
}