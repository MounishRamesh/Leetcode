class Solution {
    public int maxBottlesDrunk(int n, int e) {
        int count = n ;
        while(n >= e){
            n = n-e ;
            e ++ ;
            count ++ ;
            n ++ ;
        }
        return count ;
    }
}