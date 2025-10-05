class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ls = new ArrayList<>() ;
        HashSet<String> hs = new HashSet<>() ;
        for(int i = 0 ; i < s.length()-10+1 ; i ++){
            String s1 = s.substring(i,i+10) ;
            if(hs.contains(s1)){
                if(!ls.contains(s1)){
                    ls.add(s1) ;
                }
            }
            else{
                hs.add(s1) ;
            }
        }
        return ls ;
    }
}