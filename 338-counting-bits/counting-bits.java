// class Solution {
//     public int[] countBits(int n) {
//         int[] arr = new int[n+1] ;
//         for(int i = 0; i < arr.length ;i ++){
//             int count = binary(i) ;
//             arr[i] = count ;
//         }
//         return arr ;
//     }
//     public static int binary(int i){
//         int count = 0 ;
//         while( i > 0){
//             int rem = i%2 ;
//             if(rem == 1){
//                 count ++ ;
//             }
//             i/=2 ;
//         }
//         return count ;
//     }
// }


public class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1] ;
        for(int i = 0 ;i < arr.length ; i++){
            arr[i] = Integer.bitCount(i) ;
        }
        return arr ;
    }
}