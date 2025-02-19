class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>() ;
        StringBuilder sb = new StringBuilder() ;
        for(int i =0 ; i< s.length() ;i ++){
            char ch = s.charAt(i) ;
            if(!st.isEmpty()){
                if(ch == '*'){
                    st.pop(); 
                }
                else{
                    st.push(ch); 
                }
            }
            else{
                st.push(ch) ;
            }
        }
        for(char val : st){
            sb.append(val) ;
        }
        return sb.toString(); 
    }
}