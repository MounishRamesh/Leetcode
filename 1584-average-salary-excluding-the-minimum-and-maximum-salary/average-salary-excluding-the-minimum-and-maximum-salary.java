class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE ;
        int max = 0 ;
        for(int i : salary){
            min = Math.min(min , i) ;
            max = Math.max(max , i) ;
        }
        int max_count = 0 ;
        int min_count = 0 ;
        int total = 0 ;
        for(int i : salary){
            if(i == min){
                min_count ++ ;
            }
            else if(i == max){
                max_count ++ ;
            }
            else{
                total+= i ;
            }
        }
        double ind = (double)(salary.length-(min_count + max_count)) ;
        double ans = (double)(total/ind) ;
        return ans ;
    }
}