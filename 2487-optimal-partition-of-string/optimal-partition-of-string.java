class Solution {
    public int partitionString(String s) {
        HashSet<Character> hs = new HashSet<>() ;
        int count = 1 ;
        int i = 0 ;
        while(i < s.length()){
            char ch = s.charAt(i); 
            if(hs.contains(ch)){
                count ++ ;
                hs.clear(); 
            }
            hs.add(ch); 
            i ++; 
        }  
        return count ;
    }
}