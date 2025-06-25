class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ls = new ArrayList<>() ;
        for(int i = 0 ; i < s.length() ;i ++){
            boolean ans = false ;
            List<Integer> ls1 = new ArrayList<>() ;
            int a = cons(s , i) ;
            if(a >= 0){
                ans = true ;
                ls1.add(i) ;  
                i += a-1 ;
                ls1.add(i) ;
            }
            if(ans){
                ls.add(ls1) ;
            }
        }
        return ls ;
    }
    public static int cons(String s , int j){
        int count = 1 ;
        int ind = 0 ;
        for(int i = j ;i < s.length()-1 ; i ++){
            char ch = s.charAt(i) ;
            char ch1 = s.charAt(i+1) ;
            if(ch == ch1){
                count ++ ;
                ind = i+1 ;
            }
            else{
                break ;
            }
        }
        if(count >= 3){
            return (ind-j)+1  ;
        }
        return -1 ;
    }
}