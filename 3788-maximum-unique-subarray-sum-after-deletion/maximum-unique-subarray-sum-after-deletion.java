class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> hs = new HashSet<>() ;
        for(int i : nums){
            hs.add(i) ;
        }
        int count = 0 ;
        int max = Integer.MIN_VALUE  ;
        int[] arr = new int[hs.size()] ;
        int j = 0 ;
        for(int i : hs){
            arr[j] = i ;
            j ++ ;
        }
        Arrays.sort(arr) ;
        for(int i = arr.length-1 ;i >= 0 ;i --){
            count += arr[i] ;
            max = Math.max(count , max) ;
            
        }
        return max ;
    }
}