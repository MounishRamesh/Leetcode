class Solution {
    public boolean isNStraightHand(int[] h, int g) {
        if(h.length%g != 0){
            return false ;
        }
        Arrays.sort(h) ;
        List<Integer> ls = new ArrayList<>() ;
        int ind = h[0] ;
        for(int i : h){
            ls.add(i) ;
        }
        List<Integer> ls1 = new ArrayList<>() ;
        while(ls.size() != 0){
            while(ls.size() > 0 && ls.contains(ind)){
                ls1.add(ind) ;
                ls.remove(Integer.valueOf(ind)) ;
                // ind ++ ;
                // System.out.println(ind);
                // System.out.println(ls1) ;
                // System.out.println(ls) ;
                if(ls1.size() == g){
                    break ;
                }
                // ls1.clear() ;
                ind ++ ;
            }
            if(ls.size() > 0){
                ind = ls.get(0) ;
            }
            if(ls1.size() == g){
                ls1.clear() ;
            }    
            else{
                return false ;
            }
        }
        // System.out.println(ls+" " + ls1) ;
        if(ls1.size() == 0){
            return true ;
        }
        return false;
    }
}