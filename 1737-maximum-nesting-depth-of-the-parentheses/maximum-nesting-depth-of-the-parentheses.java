class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>() ;
        int max = 0 ;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch) ;
            }
            else if(ch == ')'){
                max = Math.max(st.size() , max) ;
                st.pop() ;
                // System.out.println(st) ;
            }
        }
        return max ;
    }
}