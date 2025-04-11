class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0 ;
        for(int i = low ; i <= high ;i ++ ){
            if(digits(i) == true){
                count ++ ;
            }
        }
        return count ;
    }
    public static boolean digits(int i){
        int a = (int) Math.log10(i)+1 ;
        if(a % 2 != 0){
            return false ;
        }
        int[] arr = new int[a] ;
        int j = a-1 ;
        while(i > 0){
            int rem = i % 10 ;
            arr[j] = rem ;
            i /= 10 ;
            j -- ;
        }
        int count1 = 0 ;
        int count2 = 0 ;
        int n = a /2 ;
        for(int k = 0 ;k < n ;k ++){
            count1 += arr[k] ;
        }
        for(int k = n ;k < arr.length; k ++){
            count2 += arr[k] ;
        }
        if(count1 == count2){
            return true ;
        }
        return false ;
    }
}