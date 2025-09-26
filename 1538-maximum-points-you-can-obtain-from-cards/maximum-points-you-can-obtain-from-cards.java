class Solution {
    public int maxScore(int[] c, int k) {
        int n = c.length ;
        int sum = 0 ;
        
        for(int i = n-k ;i < n ;i ++){
            sum += c[i] ;
        }
        int max = sum ;
        int left = 0 ;
        for(int i = 0 ; i < k ;i ++){
            left += c[i] ;
            sum = sum - c[n-k+i] ;
            max = Math.max(max , left+sum) ;
            System.out.println(left+" " + sum) ;
        }
        return max;
    }
}