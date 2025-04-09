class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer , Integer > hs = new HashMap<>() ;
        HashMap<Integer , Integer > hs1 = new HashMap<>() ;
        List<List<Integer>> ls = new ArrayList<>() ;
        int n = matches.length ;
        for(int i = 0 ;i < n ;i ++){
            int val = matches[i][0] ;
            if(hs.containsKey(val)){
                hs.put(val , hs.get(val )+1) ;
            }
            else{
                hs.put(val , 1) ;
            }
        }
        for(int i = 0 ;i < n ;i ++){
            int val = matches[i][1] ;
            if(hs1.containsKey(val)){
                hs1.put(val , hs1.get(val )+1) ;
            }
            else{
                hs1.put(val , 1) ;
            }
        }
        List<Integer> ls1 = new ArrayList<>() ;
        for(int i : hs.keySet()){
            if(!hs1.containsKey(i)){
                ls1.add(i) ;
            }
        }
        Collections.sort(ls1) ;
        ls.add(ls1) ;
        List<Integer> ls2 = new ArrayList<>() ;
        for(int j : hs1.keySet()){
            if(hs1.get(j) == 1){
                ls2.add(j) ;
            }
        }
        Collections.sort(ls2) ;
        ls.add(ls2); 
        return ls ;
    }
}