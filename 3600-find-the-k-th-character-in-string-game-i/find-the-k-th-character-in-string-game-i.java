class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder() ;
        sb.append('a') ;
        while(sb.length() <= k){
            String s = sb.toString() ;
            //sb.append(s) ;
            for(int i = 0 ; i < s.length() ; i ++){
                char ch = (char)(s.charAt(i)+1) ;
                if(ch == 'z'){
                    sb.append('a') ;
                }
                else{
                    sb.append(ch) ;
                }
            }
        }
        String n = sb.toString() ;
        System.out.println(n) ;
        return n.charAt(k-1) ;
    }
}