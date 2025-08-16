// class Solution {
//     public double myPow(double x, int n) {
//         long N = n ;
//         if(n < 0){
//             N = -N ;
//             x = 1/x ;
//         }
//         return value(x,N) ;
//     }
//     public static double value(double x , Long N){
//         if(N == 0){
//             return 1.0 ;
//         }
//         double half = value(x , N/2) ;
//         if(N%2 == 0){
//             return half * half ;
//         }
//         else{
//              return half * half * x ;
//         }

//     }
// }

class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1.0;
        else if(x == 0.0) return 0.0;

        double cur = pow(x, Math.abs((long)n));
        // System.out.println(cur);
        if(n < 0){
            return 1.0 / cur;
        }else{
            return cur;
        }
    }

    private double pow(double x, long n){
        double res = 1;
        while(n > 0){
            if((n & 1) == 1){
                res *= x;
                n--;
            }
            x = (x * x);
            n /= 2;

        }
        return res;
    }
}