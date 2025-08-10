class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<String> ls = new ArrayList<>() ;
        for(String i : words){
           ls.add(i); 
        }   
        Collections.sort(ls) ;
        List<Integer> res = new ArrayList<>() ;
        int k = words[0].length() ;
        int l = k*words.length ;
        for(int i = 0 ;i < s.length()-l+1 ;i ++){
            List<String> ls2 = new ArrayList<>() ;
            int j = i ;
            while(j < l+i){
                ls2.add(s.substring(j,j+k)) ;
                j += k ;
            }
            Collections.sort(ls2) ;
            //System.out.println(ls2) ;
            if(ls.equals(ls2)){
                res.add(i) ;
            }
        }
        return res ;
    }
}