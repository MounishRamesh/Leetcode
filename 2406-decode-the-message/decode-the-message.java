class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hs = new HashMap<>() ;
        char ch = 'a' ;
        for(int i = 0 ;i < key.length() ;i ++){
            if(key.charAt(i) != ' ' && !hs.containsKey(key.charAt(i))){
                hs.put(key.charAt(i) , ch) ;
                ch = (char)(ch+1) ;
            }
        }
        StringBuilder sb  = new StringBuilder() ;
        for(int i = 0 ;i < message.length(); i++){
            if(message.charAt(i) == ' '){
                sb.append(" ") ;
            }
            else{
                char val = hs.get(message.charAt(i)) ;
                sb.append(val) ;
            }
        }
        return sb.toString() ;
    }
}