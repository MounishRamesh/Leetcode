class Solution {
    public int maxDistance(List<List<Integer>> a) {
        HashMap<Integer , List<Integer>> hs = new HashMap<>() ;
        int ind = 0 ;
        for(List<Integer> i : a){
            hs.put(ind , i) ;
            ind ++ ;
        }
        int min = Integer.MAX_VALUE ;
        int max1 = Integer.MIN_VALUE ;
        int a1 = 0 ;
        int a2 = 0 ;
        int ind2 = 0 ;
        for(List<Integer> i : a){
            for(int j : i){
                if(j < min){
                    min = j ;
                    a1 = ind2 ;
                }
                if(j > max1){
                    max1 = j ;
                    a2 = ind2 ;
                }
            }
            ind2 ++ ;
        }
        // System.out.println(max1 +" " + a1) ;
        int max = Integer.MIN_VALUE ;
        int min1 = Integer.MAX_VALUE ;
        int ind3 = 0 ;
        
        for(List<Integer> i : a){
            for(int j : i){
                if(j > max && ind3 != a1){
                    max = j ;   
                }
                if(j < min1 && ind3 != a2){
                    min1 = j ;
                }
            }
            ind3 ++ ;
        }
        int d = Math.abs(min-max) ;
        int e = Math.abs(min1-max1) ;
        return Math.max(d,e) ;
    }
}