class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr = new char[n] ;
        for(int i = 0 ; i < n ; i ++){
            arr[i] = 'a' ;
        }
        int j = n-1 ;
        int rem = k-n ;
        while(rem >= 26){
            arr[j] = 'z' ;
            rem -= 25 ;
            j -- ;
        }
        arr[j] = (char)('a'+rem) ;
        StringBuilder sb = new StringBuilder() ;
        for(char i : arr){
            sb.append(i) ;
        }
        return sb.toString() ;
    }
}