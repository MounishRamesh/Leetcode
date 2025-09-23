class Solution {
    public int maxDepth(String s) {
        int count = 0 ;
        int depth = 0 ;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count ++ ;
                depth = Math.max(depth , count) ;
            }
            else if(ch == ')'){
                count -- ;
            }
        }
        return depth ;
    }
}