class Solution {
    public String[] shortestSubstrings(String[] arr) {
        String[] n = new String[arr.length] ;
        for(int i = 0 ; i < arr.length ; i ++){
            String s = arr[i] ;
            for(int j = 0 ; j < s.length() ;j ++){
                for(int k = j ; k < s.length() ;k ++){
                    String s1 = s.substring(j,k+1) ;
                    if(contains(s1 , arr , i)){
                        if(lex(n[i],s1)){
                            n[i] = s1 ;
                        }
                    }
                }
            }
            if(n[i] == null){
                n[i] = "" ;
            }
        }
        return n ;
    }
    public static boolean contains(String s , String[] arr , int i1){
        for(int i = 0 ; i < arr.length ; i ++){
            if(i != i1){
                String s1 = arr[i] ;
                if(s1.contains(s)){
                    return false ;
                }
            }
        }
        return true; 
    }
    public static boolean lex(String a , String b){
        if(a == null){
            return true ;
        }
        if(b.length() < a.length()){
            return true ;
        }
        if(b.length() == a.length() && b.compareTo(a) <= 0){
            return true ;
        }
        return false;
    }
}