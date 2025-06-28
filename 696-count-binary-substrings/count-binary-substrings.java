class Solution {
    public int countBinarySubstrings(String s) {
        int count = 1 ;
        List<Integer> ls = new ArrayList<>() ;
        for(int i = 1 ; i < s.length() ;i ++){
            if(s.charAt(i) == s.charAt(i-1)){
                count ++ ;
            }
            else{
                System.out.println(s.charAt(i) + " " + s.charAt(i-1)) ;
                ls.add(count) ;
                count = 1 ;
            }
        }
        ls.add(count) ;
        
        int rem = 0 ;
        for(int i = 0 ;i < ls.size()-1 ; i ++){
            int a = ls.get(i) ;
            int b = ls.get(i+1) ;
            rem += Math.min(a , b) ;
        }
        return rem ;
    }
}