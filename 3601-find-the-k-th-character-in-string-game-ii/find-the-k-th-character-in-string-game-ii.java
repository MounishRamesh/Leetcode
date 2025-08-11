class Solution {
    public char kthCharacter(long k, int[] arr) {
        char ch = 'a' ;
        long length =1L ;
        int m = 0 ;
        //int arr_length = arr.length ;
        while(length <k && m < arr.length){
            length *= 2L ;
            m ++ ;
        }
        int i = m-1 ;
        while(length > 1){
            long half = length/2 ;
            if(k > half ){
                k = k - half ;
                if(arr[i] != 0){
                    ch = (char)((ch-'a'+1)%26+'a'); 
                    //i -- ;
                }
            }
            // i ++ ;
            i -- ;
            length = half ;
        }
        return ch ;
    }
}