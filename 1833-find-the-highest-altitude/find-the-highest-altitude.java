class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1] ;
        arr[0] = 0 ;
        int sum = 0 ;
        for(int i = 1 ;i <= gain.length ;i ++){
            sum = sum + gain[i-1] ;
            arr[i] = sum ;
        }
        int max = 0 ;
        for(int i : arr){
            max = Math.max(max ,i) ;
        }
        return max ;
    }
}