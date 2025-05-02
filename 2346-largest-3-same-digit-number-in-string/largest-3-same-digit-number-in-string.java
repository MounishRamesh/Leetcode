class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb = new StringBuilder() ;
        ArrayList<Character> ls = new ArrayList<>() ;
        for(int i = 0 ;i < num.length()-2 ;i ++){
            if(isunique(num , i , i+2 )){
                for(int j = i ; j < i+3 ;j ++){
                    ls.add(num.charAt(j)); 
                }
            }
        }
        Collections.sort(ls) ;
        if(ls.size()>=3){
            for(int i = ls.size()-3 ; i < ls.size() ;i ++){
                sb.append(ls.get(i)) ;
            }
        }
        return sb.toString() ;
    }
    public static boolean isunique(String num , int sta , int end){
        int i = sta ;
        int j = end ;
        while(i <= j){
            if(num.charAt(i) != num.charAt(j)){
                return false ;
            }
            i ++ ;
        }
        return true ;
    }
}