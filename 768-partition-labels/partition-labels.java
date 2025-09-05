class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ls = new ArrayList<>() ;
        HashMap<Character , Integer> hs = new HashMap<>() ;
        for(int i = 0 ; i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            for(int j = s.length()-1 ; j >= 0 ;j --){
                char ch1 = s.charAt(j) ;
                if(ch == ch1){
                    hs.put(ch , hs.getOrDefault(ch ,j)) ;
                    break ; 
                }
            }
        }
        int i = 0 ;
        while(i < s.length()){
            char ch = s.charAt(i) ;
            int first = hs.get(ch) ;
            int max = first ;
            for(int j = i ; j <= max ; j ++){
                char ch1 = s.charAt(j) ;
                int count = hs.get(ch1); 
                if(count > max){
                    max = count ;
                }
            }
            int len = max-i+1 ;
            ls.add(len) ;
            i = max+1 ;
        }
        return ls ;
    }
}