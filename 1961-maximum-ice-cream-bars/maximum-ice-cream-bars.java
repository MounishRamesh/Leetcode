class Solution {
    public int maxIceCream(int[] c, int coins) {
        Arrays.sort(c) ;
        int count = 0 ;
        for(int i : c){
            coins -= i ;
            if(coins >= 0){
                count ++ ;
            }
            else{
                return count ;
            }
        }
        return count ;
    }
}