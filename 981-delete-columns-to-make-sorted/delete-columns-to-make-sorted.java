class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0 ;
        int n = strs[0].length() ;
        //System.out.println(n) ;
        for(int i = 0 ;i < n ;i ++){
            for(int j = 0 ; j < strs.length-1 ; j ++ ){
                char ch = strs[j].charAt(i) ;
                char ch1 = strs[j+1].charAt(i) ;
                //System.out.print(ch + " " + ch1+" ") ;
                if(ch > ch1){
                    count ++ ;
                    break ;
                }
            }
            //System.out.println() ;
        }
        return count ;
    }
}