class Solution {
    public int compress(char[] chars) {
        int j = 0 ;
        int count = 1 ;
        for(int i = 1 ;i < chars.length ;i ++){
            if(chars[i-1] == chars[i]){
                count ++ ;
            }
            else{
                chars[j] = chars[i-1] ;
                j ++ ;
                if(count > 1){
                    String s = Integer.toString(count) ;
                    //System.out.print(s + " ") ;
                    for(char ch :s.toCharArray()){
                        //System.out.print(ch + " ") ;
                        chars[j] = ch ;
                        j ++ ;
                    }
                }
                count = 1 ;
            }
        }
        chars[j] = chars[chars.length-1] ;
        j ++ ;
        if(count > 1){
            String s = Integer.toString(count) ;
            for(char ch : s.toCharArray()){
                chars[j] = ch ;
                j ++ ;
            }
        }
        return j ;
    }
}