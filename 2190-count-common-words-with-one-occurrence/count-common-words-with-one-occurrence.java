class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0 ;
        int count2 = 0 ;
        HashMap<String,Integer> hs = new HashMap<>() ;
        HashMap<String , Integer > hs1 = new HashMap<>() ; 
        for(String s : words1){
            if(hs.containsKey(s)){
                hs.put(s,hs.get(s)+1) ;
            }
            else{
                hs.put(s,1) ;
            }
        }
        for(String s1 : words2){
            if(hs1.containsKey(s1)){
                hs1.put(s1,hs1.get(s1)+1) ;
            }
            else{
                hs1.put(s1,1) ;
            }
        }
        for(String s : hs.keySet()){
            if(hs.get(s) == 1){
                if(hs1.containsKey(s)){
                    if(hs1.get(s) == 1){
                        count ++ ;
                    }
                }
                else{
                    hs1.put(s , 0) ;
                }
            }
        }
        
        return count ;
    }
}