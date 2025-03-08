class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0 ;
        for(int i = 0 ; i < k ; i ++){
            if(blocks.charAt(i) == 'W'){
                count ++ ;
            }
        }
        int max = count ;
        int j = 0 ;
        int k1 = k ;
        int k2 = k ;
        while(k2 < blocks.length()){
            int sum = 0 ;
            int sum2 = 0 ;
            j ++ ;
            for(int i = j ; i < k2+1 ; i ++){
                if(blocks.charAt(i) == 'W'){
                    sum ++ ;
                }
                else if(blocks.charAt(i) == 'B'){
                    sum2 ++ ;
                }
            }
            if(sum2 >= k){
                return 0 ;
            }
            max = Math.min(max , sum) ;
            k2 ++ ;
        }
        return max ;
    }
}