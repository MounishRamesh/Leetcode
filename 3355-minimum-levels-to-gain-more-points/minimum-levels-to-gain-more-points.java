class Solution {
    public int minimumLevels(int[] possible) {
        int count1 = 0 ;
        int count2 = 0 ;
        for(int i : possible){
            if(i == 0){
                count1 ++ ;
            }
            else{
                count2 ++ ;
            }
        }
        int sum1 = 0 ;
        int sum2 = 0;
        for(int i = 0 ; i < possible.length-1 ;i ++){
            if(possible[i] == 0){
                sum1 ++ ;
                count1 -- ;
            }
            else{
                sum2 ++ ;
                count2 -- ;
            }
            int tot1 = (count1*-1)+ (count2*1); 
            int tot2 = (sum1*-1) + (sum2*1) ;
            if(tot2 > tot1){
                return i+1 ;
            }
        }
        return -1 ;
    }
}