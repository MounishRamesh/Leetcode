class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder() ;
        sb.append(a) ;
        int count = 1 ;
        for(int i = 0 ; sb.length() < b.length() ;i ++){
            sb.append(a) ;
            count ++ ;
        }
        String s = sb.toString() ;
        if(s.contains(b)){
            return count  ;
        }
        sb.append(a) ;
        count ++ ;
        s = sb.toString() ;
        if(s.contains(b)){
            return count ;
        }
        return -1 ;
    }
}