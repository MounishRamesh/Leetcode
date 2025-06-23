class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>() ;
        for(int i =0 ; i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            if(ch == '#' && (!st.isEmpty())){
                st.pop() ;
            }
            else if(ch != '#'){
                st.push(ch) ;
            }
        }
        Stack<Character> st1 = new Stack<>() ;
        for(int i = 0 ;i < t.length() ;i ++){
            char ch = t.charAt(i) ;
            if(ch == '#' && (!st1.isEmpty())){
                st1.pop() ;
            }
            else if(ch != '#'){
                st1.push(ch) ;
            }
        }
        if(st.equals(st1)){
            return true ;
        }
        
        return false ;
    }
}