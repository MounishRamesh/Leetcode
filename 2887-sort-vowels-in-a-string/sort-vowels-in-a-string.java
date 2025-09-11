class Solution {
    public String sortVowels(String s) {
        List<Character> ls = new ArrayList<>() ;
        String vow = "aeiouAEIOU" ;
        for(int i = 0 ; i < s.length() ; i ++){
            char ch = s.charAt(i) ;
            if(vow.indexOf(ch) != -1){
                ls.add(ch) ;
            }
        }
        Collections.sort(ls) ;
        StringBuilder sb = new StringBuilder() ;
        int j = 0 ;
        for(int i = 0 ; i < s.length() ; i ++){
            char ch = s.charAt(i) ;
            if(vow.indexOf(ch) != -1){
                sb.append(ls.get(j));
                j ++ ;
            }
            else{
                sb.append(ch) ;
            }
        }
        
        return sb.toString() ;
    }
}