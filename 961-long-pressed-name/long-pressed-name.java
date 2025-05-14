class Solution {
    public boolean isLongPressedName(String name, String t) {
        int i = 0 ;
        int j = 0 ;
        while(j < t.length()){
           if(i < name.length() && name.charAt(i) == t.charAt(j)){
            i ++ ;
            j ++ ;
           }
           else if(j > 0 && t.charAt(j) == t.charAt(j-1)){
            j ++ ;
           }
           else{
            return false ;
           }
        }
        if(i != name.length()){
            return false ;
        }
        return true ;
    }
}