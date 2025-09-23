class Solution {
    public int beautySum(String s) {
        int count  = 0 ;
        // int[] arr = new int[27] ;
        for(int i = 0 ; i < s.length() ;i ++){
            int[] arr = new int[27] ;
            for(int j = i ; j < s.length() ;j ++){
                char ch = s.charAt(j) ;
                arr[ch-'a']++ ;
                int max = 0 ;
                int min = Integer.MAX_VALUE ;
                for(int k = 0 ; k < 27 ;k ++){
                    if(arr[k]>0){
                        max = Math.max(max , arr[k]) ;
                        min = Math.min(min , arr[k]) ;
                    }
                }
                count += (max-min) ;
            }
        }
        return count ;
    }
}