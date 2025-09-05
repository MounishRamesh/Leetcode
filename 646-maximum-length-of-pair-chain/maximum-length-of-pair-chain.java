class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        for (int i = 0; i < n - 1; i++) {
            if (pairs[i][1] > pairs[i + 1][1]) {
                int[] temp = pairs[i];
                pairs[i] = pairs[i + 1];
                pairs[i + 1] = temp;
                if(i > 0){
                    i = i-2 ;
                }
            }
        }
        int max = 1 ;
        for(int i = 0 ; i < pairs.length;i ++){
            int count = 1;
            int last = pairs[i][1]; 
            for(int j = i+1 ; j < pairs.length ;j ++){
                if(last < pairs[j][0]){
                    count ++ ;
                    last = pairs[j][1] ;
                }
            }
            max = Math.max(max , count) ;
        }
        return max ;
    }
    
}