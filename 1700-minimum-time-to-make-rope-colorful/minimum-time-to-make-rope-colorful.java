class Solution {
    public int minCost(String c, int[] n) {
        List<Integer> ls = new ArrayList<>() ;
        int count = 0 ;
        int sum = 0 ;
        for(int i = 0 ; i < c.length()-1 ; i ++ ){
            char ch = c.charAt(i) ;
            char ch1 = c.charAt(i+1) ;
            if(ch == ch1){
                ls.add(n[i]) ;
                sum += n[i] ;
            }
            else{
                ls.add(n[i]) ;
                sum += n[i] ;
                Collections.sort(ls) ;
                int rem = ls.get(ls.size()-1) ;
                sum -= rem ;
                count += sum ;
                
                sum = 0 ;
                ls.clear() ;
            }
        }
        ls.add(n[c.length()-1]) ;
        sum += n[c.length()-1] ;
        Collections.sort(ls) ;
        int rem = ls.get(ls.size()-1) ;
        sum -= rem ;
        count += sum ;
        return count ;
    }
}