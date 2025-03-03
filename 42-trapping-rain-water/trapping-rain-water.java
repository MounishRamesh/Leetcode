class Solution {
    public int trap(int[] height) {
        int n = height.length ;
        int i = 0 ;
        int j = n-1 ;
        int lh = 0 ;
        int rh = 0 ;
        int res = 0 ;
        while(i <= j){
            if(lh <= rh){
                if(height[i] > lh){
                    lh = height[i] ;
                }
                else{
                    res =res + lh-height[i] ;   
                }
                i ++ ;
            }
            else{
                if(height[j] > rh){
                    rh = height[j] ;
                }
                else{
                    res = res + rh-height[j] ;
                }
                j --; 
            }
        }
        return res;
    }
}