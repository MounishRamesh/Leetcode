class Solution {
    public double myPow(double x, int n) {
        long N = n ;
        if(n < 0){
            N = -N ;
            x = 1/x ;
        }
        return value(x,N) ;
    }
    public static double value(double x , Long N){
        if(N == 0){
            return 1.0 ;
        }
        double half = value(x , N/2) ;
        if(N%2 == 0){
            return half * half ;
        }
        else{
             return half * half * x ;
        }

    }
}