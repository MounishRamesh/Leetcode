class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>() ;
        Stack<Integer> st1 = new Stack<>() ;
        for(int i = 0 ; i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            if(ch == '('){
                st.push(i) ;
            }
            else if(ch == '*'){
                st1.push(i) ;
            }
            else{
                if(!st.isEmpty()){
                    st.pop() ;
                }
                else if(!st1.isEmpty()){
                    st1.pop() ;
                }
                else{
                    return false ;
                }
            }
        }
        while(!st.isEmpty() && !st1.isEmpty()){
            
            if(st.peek() < st1.peek()){
                st.pop() ;
                st1.pop() ;
            }
            else
            return false ;
        }
        return (st.isEmpty()) ;
    }
}