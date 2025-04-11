class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false ;
        }
        if(s.equals(goal)){
            HashMap<Character , Integer > hs = new HashMap<>()  ;
            for(int i =0 ;i < s.length() ;i ++){
                if(hs.containsKey(s.charAt(i))){
                    hs.put(s.charAt(i) , hs.get(s.charAt(i))+1) ;
                }
                else{
                    hs.put(s.charAt(i) , 1) ;
                }
                if(hs.get(s.charAt(i))>1){
                    return true ;
                }
            }
            return false ;
        }
        List<Integer> ls = new ArrayList<>() ;
        for(int i = 0  ; i < s.length() ;i ++){
            if(s.charAt(i) != goal.charAt(i)){
                ls.add((i)); 
            }
        }
        if(ls.size() == 2){
            if(s.charAt(ls.get(0)) == goal.charAt(ls.get(1)) && s.charAt(ls.get(1)) == goal.charAt(ls.get(0))){
                return true ;
            }
        }
        return false ;
    }
}