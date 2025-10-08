class Solution {
    public int[] successfulPairs(int[] s, int[] p, long su) {
        int[] arr = new int[s.length] ;
        Arrays.sort(p) ;
        for(int i = 0 ; i < s.length ; i ++){
            int rem = content(s[i] , p , su) ;
            arr[i] =  p.length - rem ;
        }
        return arr ;
    }
    public static int content(int a, int[] arr , long t){
        int i = 0 ;
        int j = arr.length-1 ;
        int ans = arr.length ;
        while(i <= j){
            int mid = (i+j) / 2 ;
            long val = (long) a*arr[mid] ;
            if(val < t){
                i = mid+1 ;
            }
            else{
                j = mid-1 ;
                ans = mid ;
            }
        }
        return ans ;
    }
}