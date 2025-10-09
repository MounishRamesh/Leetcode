class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0){
            return 1 ;
        }
        int rem = 9 ;
        int count = 10 ;
        int uni = 9 ;
        for(int i = 2 ; i <= n && rem > 0 ; i ++ ){
            uni*= rem ;
            count += uni ;
            rem -- ;
        }
        return count ;
    }
}