class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character , Integer > hs= new HashMap<>() ;
        for(int i = 0 ;i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            hs.put(ch ,hs.getOrDefault(ch,0)+1) ;
        }
        List<Integer> ls = new ArrayList<>() ;
        for(int i : hs.values()){
            ls.add(i);
        }
        //System.out.println(ls) ;
        for(int i = 0 ;i< ls.size()-1 ;i ++){
            int val1 = ls.get(i) ;
            int val2 = ls.get(i+1) ;
            System.out.print(val1 + " " + val2 + " ") ;
            if(val1 != val2){
                return false ;
            }
        }
        return true;
    }
}