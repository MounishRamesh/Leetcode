class Solution {
    public String reversePrefix(String word, char ch) {
        int val = word.indexOf(ch) ;
        if(val == -1){
            return word; 
        }
        Stack<Character> st = new Stack<>() ;
        for(int i =0 ;i <= val ; i ++){
            st.push(word.charAt(i)) ;
        }
        StringBuilder sb = new StringBuilder() ;
        while(!st.isEmpty()){
            sb.append(st.pop()) ;
        }
        for(int i = val + 1 ; i < word.length() ; i ++){
            sb.append(word.charAt(i)) ;
        }
        return sb.toString();
    }
}