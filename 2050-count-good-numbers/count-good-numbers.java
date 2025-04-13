class Solution {
    public int countGoodNumbers(long n1) {
        int mod = 1000000007 ;
        long n = n1 ;
        long val = (n+1)/2 ;
        long val2 = (n/2) ;
        long pro = 1 ;
        long base = 5 ;
        while(val > 0){
            if(val % 2 == 1){
                pro = (pro * base) % mod ;
            }
            base = (base * base)% mod ;
            val /= 2 ;
        }
        long base2 = 4 ;
        while(val2 > 0){
            if(val2 % 2 == 1){
                pro = (pro * base2) % mod;
            }
            base2 = (base2 * base2) % mod ;
            val2 /= 2 ;
        }
        return (int)(pro) ;
    }
}