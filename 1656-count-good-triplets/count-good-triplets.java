class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0 ;
        int n = arr.length ;
        for(int i =0 ;i < n ; i++){
            for(int j = i + 1; j < n ;j++){
                for(int k = j + 1 ;k < n ;k ++){
                    int val = Math.abs(arr[i] - arr[j]) ;
                    int val2 = Math.abs(arr[j] - arr[k]) ;
                    int val3 = Math.abs(arr[i] - arr[k]) ;
                    if(val <= a && val2 <= b && val3 <= c){
                        count ++ ;
                    }
                }
            }
        }
        return count ;
    }
}