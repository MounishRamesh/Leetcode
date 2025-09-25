class Solution {
    public int numberOfSubstrings(String s) {
        int j = 0 ;
        int i = 0 ;
        int count1 = 0 ;
        HashMap<Character , Integer> hs = new HashMap<>() ;
        while(j < s.length()){
            char ch = s.charAt(j) ;
            hs.put(ch , hs.getOrDefault(ch,0)+1);
            while(hs.size() >= 3){
                // System.out.println(j) ;
                count1 += s.length()-j ;
                char left = s.charAt(i) ;
                hs.put(left , hs.get(left)-1) ;
                if(hs.get(left) == 0){
                    hs.remove(left) ;
                }
                i ++ ;
            }
            j ++ ;
        }
        return count1 ;
    }
}