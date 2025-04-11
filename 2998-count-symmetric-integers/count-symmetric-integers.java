class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0 ;
        for(int i = low ; i <= high; i ++){
            String s = String.valueOf(i) ;
            int n = s.length() ;
            if(n%2 != 0){
                continue ;
            }
            int half = n/2 ;
            int count1 = 0 ;
            int count2 = 0 ;
            for(int i1 = 0 ;i1 < half ;i1 ++){
                count1 += s.charAt(i1) ;
                count2 += s.charAt(half + i1) ;
            }
            if(count1 == count2){
                count ++ ;
            }
        }
        return count ;
    }
}