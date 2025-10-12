class Solution {
    public List<String> commonChars(String[] w) {
        HashMap<Character , Integer> hs = new HashMap<>() ;
        String s = w[0] ;
        for(char ch : w[0].toCharArray()){
            hs.put(ch , hs.getOrDefault(ch , 0)+1) ;
        }
        List<String> ls = new ArrayList<>() ;
        int ind = 0 ;
        for(char ch : hs.keySet()){
            int count = hs.get(ch) ;
            int max = count ;
            // System.out.println(ch+" " + count) ;
            for(int j = 1 ; j < w.length ; j ++){
                int count2 = 0 ;
                String a = w[j] ;
                for(int k = 0 ; k < a.length() ;k ++){
                    char ch1 = a.charAt(k) ;
                    if(ch == ch1){
                        count2 ++ ;
                    }
                }
                if(count2 < count){
                    max = Math.min(count2 , max) ;
                }
                // System.out.print(count2+" " + max+" ") ;
            }
            System.out.println() ;
            for(int l = 0 ; l < max ; l ++){
                ls.add(Character.toString(ch)) ;
            }
        }
        return ls ;
    }
}