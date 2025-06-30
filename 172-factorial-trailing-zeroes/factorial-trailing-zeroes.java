// class Solution {
//     public int trailingZeroes(int n) {
//         int val = factorail(n , 0) ;
//         return val ;
//     }
//     public static int factorail(int n , int sum){
//         System.out.println(sum) ;
//         if(n < 5){
//             return sum ;
//         }
//         sum += n/5 ;
//         return factorail(n/5 , sum) ;
//     }
// }


class Solution {
    public static int trailingZeroes(int n) {
        if(n < 5){
            return 0 ;
        }
        int sum = 0 ;
        while(n >= 5){
            sum = sum + n / 5 ;
            n = n / 5; 
        }
        return sum ;
    }
}