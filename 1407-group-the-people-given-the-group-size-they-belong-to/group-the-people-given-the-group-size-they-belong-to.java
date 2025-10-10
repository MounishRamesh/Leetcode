class Solution {
    public List<List<Integer>> groupThePeople(int[] g) {
        HashMap<Integer , List<Integer> > hs = new HashMap<>() ;
        List<List<Integer>> ls1 = new ArrayList<>() ;
        for(int i = 0 ; i < g.length ; i ++){
            if(!hs.containsKey(g[i])){
                hs.put(g[i] , new ArrayList<>()) ;
            }
            List<Integer> ls = hs.get(g[i]) ;
            if(ls.size() >= g[i]){
                System.out.println(ls) ;
                ls1.add(ls) ;
                hs.put(g[i] , new ArrayList<>()) ;
            }
            hs.get(g[i]).add(i) ;
        }
        for(List<Integer> i : hs.values()){
            ls1.add(i) ;
        }
        return ls1 ;
    }
}