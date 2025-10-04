class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i+1 ; j < nums.length ; j ++){
                int i1 = first(nums[i]) ;
                int j1 = nums[j]%10 ;
                if(gcd(i1,j1)==1){
                    count ++ ;
                }
            }
        }
        return count ;
    }
    public static int gcd(int i , int j){
        while(j != 0){
            int tem = j ;
            j = i%j ;
            i = tem ;
        }
        return i ;
    }
    public static int first(int i){
        int tem = 0 ;
        while(i > 0 ){
            tem = i%10 ;
            i/= 10 ;
        }
        return tem ;
    }
}