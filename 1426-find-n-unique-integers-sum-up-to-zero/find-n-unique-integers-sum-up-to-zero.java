class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n] ;
        int count = 0 ;
       
        for(int i = 1 ; i < n ;i ++){
            count += i ;
        }

        for(int i1 = 0 ; i1 < n-1 ;i1 ++){
            arr[i1] = i1+1 ;
        }
        arr[n-1] = -count ;
        return arr ;
    }
}