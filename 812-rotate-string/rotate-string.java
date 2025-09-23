class Solution {
    public boolean rotateString(String s, String goal) {
        List<String> ls = new ArrayList<>() ;
        for(char ch : s.toCharArray()){
            ls.add(String.valueOf(ch)) ;
        }
        for(int i = 0 ; i < s.length() ; i ++){
            Collections.rotate(ls , 1) ;
            if(equals(ls , goal)){
                return true ;
            }
        }
        return false ;
    }
    public static boolean equals(List<String> ls , String a){
        String s = "" ;
        for(String i : ls){
            s+= i ;
        }
        if(s.equals(a)){
            return true ;
        }
        return false ;
    }
}